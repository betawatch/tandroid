package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o extends h1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override // ld.d1
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.e;
        Throwable q10 = mVar.q(i10);
        if (mVar.x()) {
            uc.c cVar = mVar.d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            qd.h hVar = (qd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                com.google.android.gms.internal.clearcut.e eVar = qd.a.d;
                if (!kotlin.jvm.internal.j.a(obj, eVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, eVar, q10)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != eVar) {
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
