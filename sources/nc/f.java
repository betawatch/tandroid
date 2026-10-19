package nc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface f {
    int objectTypeIndication() default -1;

    int[] tags();
}
