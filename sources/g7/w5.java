package g7;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class w5 {
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            Integer num = vc.a.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = uc.a.a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }
}
