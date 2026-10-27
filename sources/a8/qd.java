package a8;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class qd {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(zb.a("Future was expected to be done: %s", future));
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

    public static k9.w b(Object obj) {
        return obj == null ? k9.w.b : new k9.w(obj);
    }

    public static k9.p c(k9.y yVar, e9.k kVar) {
        k9.p pVar = new k9.p();
        yVar.getClass();
        pVar.n = yVar;
        pVar.r = kVar;
        yVar.a(pVar, k9.r.a);
        return pVar;
    }
}
