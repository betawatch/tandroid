package c8;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class t9 {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(a8.ma.a("Future was expected to be done: %s", future));
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
