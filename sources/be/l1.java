package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class l1 extends ge.k implements e1, p0, b1 {
    public v1 d;

    @Override // be.b1
    public final w1 c() {
        return null;
    }

    @Override // be.p0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof l1) {
                if (u10 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v1.a;
                r0 r0Var = f0.j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, r0Var)) {
                    if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                        break;
                    }
                }
                return;
            }
            if (!(u10 instanceof b1) || ((b1) u10).c() == null) {
                return;
            }
            while (true) {
                Object f7 = f();
                if (f7 instanceof ge.q) {
                    return;
                }
                if (f7 == this) {
                    return;
                }
                kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                ge.k kVar = (ge.k) f7;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ge.k.c;
                ge.q qVar = (ge.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new ge.q(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = ge.k.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, f7, qVar)) {
                        kVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == f7);
            }
        }
    }

    public g1 getParent() {
        return i();
    }

    public final v1 i() {
        v1 v1Var = this.d;
        if (v1Var != null) {
            return v1Var;
        }
        kotlin.jvm.internal.i.h("job");
        throw null;
    }

    @Override // be.b1
    public final boolean isActive() {
        return true;
    }

    @Override // ge.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this) + "[job@" + f0.k(i()) + ']';
    }
}
