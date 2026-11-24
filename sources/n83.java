// default package

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface n83 {
    String c() default "";

    String f() default "";

    int[] l() default {};

    String m() default "";

    int v() default 1;
}
