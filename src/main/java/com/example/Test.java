package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojos.ComplexObject;
/**
 * 根据spring reference中的例子中的xml写出pojo对象，再打印出来
 * @author yuanshihua
 *
 */
public class Test {
	private static final Logger log = LoggerFactory.getLogger(XmlApp.class);
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		ComplexObject bean = (ComplexObject) context.getBean("moreComplexObject");
		System.out.println(bean);
		log.debug("学习依赖注入...");
		log.info("Context = {}", context);
	}
}
