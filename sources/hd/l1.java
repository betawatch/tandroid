package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l1 extends md.k implements e1, p0, b1 {
    public v1 d;

    @Override // hd.b1
    public final w1 c() {
        return null;
    }

    @Override // hd.p0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1 i9 = i();
        while (true) {
            Object u10 = i9.u();
            if (u10 instanceof l1) {
                if (u10 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v1.a;
                r0 r0Var = f0.j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(i9, u10, r0Var)) {
                    if (atomicReferenceFieldUpdater2.get(i9) != u10) {
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
                if (f10 instanceof md.q) {
                    return;
                }
                if (f10 == this) {
                    return;
                }
                kotlin.jvm.internal.i.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                md.k kVar = (md.k) f10;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = md.k.c;
                md.q qVar = (md.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new md.q(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = md.k.a;
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
        kotlin.jvm.internal.i.h("job");
        throw null;
    }

    @Override // hd.b1
    public final boolean isActive() {
        return true;
    }

    @Override // md.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.k(this) + "[job@" + f0.k(i()) + ']';
    }
}
