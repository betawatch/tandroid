package a8;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class la {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.j.e(th2, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = nd.a.a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = md.a.a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }
}
