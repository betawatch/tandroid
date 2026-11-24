// default package

import java.util.concurrent.Future;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class kke {
    public static Object a(Future future) {
        Object obj;
        boolean z = false;
        if (!future.isDone()) {
            dq9.m(pwe.a("Future was expected to be done: %s", future));
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

    public static zn5 b(RuntimeException runtimeException) {
        zn5 zn5Var = new zn5();
        zn5Var.m(runtimeException);
        return zn5Var;
    }

    public static ao5 c(Object obj) {
        return obj == null ? ao5.b : new ao5(obj);
    }
}
