package a8;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class ma {
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
