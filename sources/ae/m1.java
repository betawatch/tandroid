package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class m1 extends fe.k implements f1, q0, c1 {
    public w1 d;

    @Override // ae.c1
    public final x1 c() {
        return null;
    }

    @Override // ae.q0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof m1) {
                if (u10 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w1.a;
                s0 s0Var = g0.j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, s0Var)) {
                    if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                        break;
                    }
                }
                return;
            }
            if (!(u10 instanceof c1) || ((c1) u10).c() == null) {
                return;
            }
            while (true) {
                Object f7 = f();
                if (f7 instanceof fe.q) {
                    return;
                }
                if (f7 == this) {
                    return;
                }
                kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                fe.k kVar = (fe.k) f7;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = fe.k.c;
                fe.q qVar = (fe.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new fe.q(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = fe.k.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, f7, qVar)) {
                        kVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == f7);
            }
        }
    }

    public h1 getParent() {
        return i();
    }

    public final w1 i() {
        w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var;
        }
        kotlin.jvm.internal.i.h("job");
        throw null;
    }

    @Override // ae.c1
    public final boolean isActive() {
        return true;
    }

    @Override // fe.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.k(this) + "[job@" + g0.k(i()) + ']';
    }
}
