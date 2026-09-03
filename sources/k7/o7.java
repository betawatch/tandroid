package k7;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class o7 {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.j.e(th2, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = zc.a.a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = yc.a.a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }
}
