package c8;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class s9 {
    public static Object a(Future future) {
        Object obj;
        boolean z9 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(a8.ja.a("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th2) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z9) {
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
