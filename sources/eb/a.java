package eb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface a {
    boolean nullSafe() default true;

    Class value();
}
