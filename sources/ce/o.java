package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o extends i1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override // ce.e1
    public final void a(Throwable th2) {
        v1 i10 = i();
        m mVar = this.e;
        Throwable q5 = mVar.q(i10);
        if (mVar.x()) {
            ld.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            he.h hVar = (he.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                he.v vVar = he.a.d;
                if (!kotlin.jvm.internal.i.a(obj, vVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, q5)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        mVar.n(q5);
        if (mVar.x()) {
            return;
        }
        mVar.o();
    }
}
