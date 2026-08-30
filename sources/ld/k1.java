package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class k1 extends qd.k implements d1, o0, a1 {
    public u1 d;

    @Override // ld.a1
    public final v1 c() {
        return null;
    }

    @Override // ld.o0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof k1) {
                if (u10 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u1.a;
                q0 q0Var = e0.j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, q0Var)) {
                    if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                        break;
                    }
                }
                return;
            }
            if (!(u10 instanceof a1) || ((a1) u10).c() == null) {
                return;
            }
            while (true) {
                Object f10 = f();
                if (f10 instanceof qd.q) {
                    return;
                }
                if (f10 == this) {
                    return;
                }
                kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                qd.k kVar = (qd.k) f10;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = qd.k.c;
                qd.q qVar = (qd.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new qd.q(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = qd.k.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, f10, qVar)) {
                        kVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == f10);
            }
        }
    }

    public f1 getParent() {
        return i();
    }

    public final u1 i() {
        u1 u1Var = this.d;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.j.h("job");
        throw null;
    }

    @Override // ld.a1
    public final boolean isActive() {
        return true;
    }

    @Override // qd.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this) + "[job@" + e0.k(i()) + ']';
    }
}
