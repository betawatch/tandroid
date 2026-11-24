// default package

import java.util.concurrent.Future;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class jie {
    public static Object a(Future future) {
        Object obj;
        boolean z = false;
        if (!future.isDone()) {
            sc8.j(nue.a("Future was expected to be done: %s", future));
            return null;
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static zl5 b(RuntimeException runtimeException) {
        zl5 zl5Var = new zl5();
        zl5Var.m(runtimeException);
        return zl5Var;
    }

    public static am5 c(Object obj) {
        return obj == null ? am5.b : new am5(obj);
    }
}
