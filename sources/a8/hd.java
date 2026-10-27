package a8;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class hd {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.i.e(th2, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th2 != exception) {
            Integer num = qd.a.a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = pd.a.a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }
}
