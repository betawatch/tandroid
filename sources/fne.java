// default package

import java.util.concurrent.Future;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class fne {
    public static Object a(Future future) {
        Object obj;
        boolean z = false;
        if (!future.isDone()) {
            grb.i(fze.a("Future was expected to be done: %s", future));
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

    public static co5 b(RuntimeException runtimeException) {
        co5 co5Var = new co5();
        co5Var.m(runtimeException);
        return co5Var;
    }

    public static do5 c(Object obj) {
        return obj == null ? do5.b : new do5(obj);
    }
}
