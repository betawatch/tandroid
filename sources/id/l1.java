package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class l1 extends nd.k implements e1, p0, b1 {
    public v1 d;

    @Override // id.b1
    public final w1 c() {
        return null;
    }

    @Override // id.p0
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
                Object f10 = f();
                if (f10 instanceof nd.q) {
                    return;
                }
                if (f10 == this) {
                    return;
                }
                kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                nd.k kVar = (nd.k) f10;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = nd.k.c;
                nd.q qVar = (nd.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new nd.q(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = nd.k.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, f10, qVar)) {
                        kVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == f10);
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
        kotlin.jvm.internal.j.h("job");
        throw null;
    }

    @Override // id.b1
    public final boolean isActive() {
        return true;
    }

    @Override // nd.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this) + "[job@" + f0.k(i()) + ']';
    }
}
