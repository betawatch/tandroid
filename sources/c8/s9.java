package c8;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
