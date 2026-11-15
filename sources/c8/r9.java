package c8;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class r9 {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(a8.ka.a("Future was expected to be done: %s", future));
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

    public static m9.w b(Object obj) {
        return obj == null ? m9.w.b : new m9.w(obj);
    }

    public static m9.p c(m9.y yVar, g9.k kVar) {
        m9.p pVar = new m9.p();
        yVar.getClass();
        pVar.n = yVar;
        pVar.r = kVar;
        yVar.b(pVar, m9.r.a);
        return pVar;
    }
}
