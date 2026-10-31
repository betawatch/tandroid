package ed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Method from annotation default annotation not found: i */
/* JADX WARN: Method from annotation default annotation not found: n */
/* JADX WARN: Method from annotation default annotation not found: s */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface e {
    String c() default "";

    String f() default "";

    int[] l() default {};

    String m() default "";

    int v() default 1;
}
