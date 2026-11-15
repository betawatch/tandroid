package lc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface f {
    int objectTypeIndication() default -1;

    int[] tags();
}
