package gb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface b {
    String[] alternate() default {};

    String value();
}
