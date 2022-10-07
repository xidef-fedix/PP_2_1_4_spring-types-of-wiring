package koschei;

import koschei.config.AppConfig;
import koschei.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless = applicationContext.getBean(KoscheiTheDeathless.class);
        Ocean1 ocean1 = applicationContext.getBean(Ocean1.class);
        Island2 island2 = applicationContext.getBean(Island2.class);
        Wood3 wood3 = applicationContext.getBean(Wood3.class);
        Rabbit4 rabbit4 = applicationContext.getBean(Rabbit4.class);
        Duck5 duck5 = applicationContext.getBean(Duck5.class);
        Egg6 egg6 = applicationContext.getBean(Egg6.class);
        Needle7 needle7 = applicationContext.getBean(Needle7.class);
        Deth8 deth8 = applicationContext.getBean(Deth8.class);

        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
