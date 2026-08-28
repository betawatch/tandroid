package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends i1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override // hd.e1
    public final void a(Throwable th) {
        v1 i9 = i();
        m mVar = this.e;
        Throwable q10 = mVar.q(i9);
        if (mVar.x()) {
            qc.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            md.h hVar = (md.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                e5.c cVar2 = md.a.d;
                if (!kotlin.jvm.internal.i.a(obj, cVar2)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, cVar2, q10)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != cVar2) {
                        break;
                    }
                }
                return;
            }
        }
        mVar.n(q10);
        if (mVar.x()) {
            return;
        }
        mVar.o();
    }
}
