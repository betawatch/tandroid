// default package

import java.util.concurrent.Future;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
