package b8;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class yd {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(ac.a("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static l9.w b(Object obj) {
        return obj == null ? l9.w.b : new l9.w(obj);
    }

    public static l9.p c(l9.y yVar, f9.k kVar) {
        l9.p pVar = new l9.p();
        yVar.getClass();
        pVar.n = yVar;
        pVar.r = kVar;
        yVar.b(pVar, l9.r.a);
        return pVar;
    }
}
