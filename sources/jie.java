// default package

import java.util.concurrent.Future;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
