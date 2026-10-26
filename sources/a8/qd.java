package a8;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
