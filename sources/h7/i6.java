package h7;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.j.e(th, "<this>");
        kotlin.jvm.internal.j.e(exception, "exception");
        if (th != exception) {
            Integer num = wc.a.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = vc.a.a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }
}
