package ma;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface a {
    boolean nullSafe() default true;

    Class value();
}
