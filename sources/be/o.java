package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class o extends i1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override // be.e1
    public final void a(Throwable th2) {
        v1 i10 = i();
        m mVar = this.e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            kd.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            ge.h hVar = (ge.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                com.google.android.gms.internal.clearcut.e eVar = ge.a.d;
                if (!kotlin.jvm.internal.i.a(obj, eVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, eVar, q6)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != eVar) {
                        break;
                    }
                }
                return;
            }
        }
        mVar.n(q6);
        if (mVar.x()) {
            return;
        }
        mVar.o();
    }
}
