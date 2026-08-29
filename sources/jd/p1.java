package jd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p1 extends od.b {
    public final k1 b;
    public v1 c;
    public final /* synthetic */ u1 d;
    public final /* synthetic */ a1 e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.e = a1Var;
        this.b = k1Var;
    }

    @Override // od.b
    public final void b(Object obj, Object obj2) {
        od.l lVar = (od.l) obj;
        boolean z10 = obj2 == null;
        od.l lVar2 = this.b;
        od.l lVar3 = z10 ? lVar2 : this.c;
        if (lVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = od.l.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, lVar3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z10) {
                od.l lVar4 = this.c;
                kotlin.jvm.internal.j.b(lVar4);
                lVar2.e(lVar4);
            }
        }
    }

    @Override // od.b
    public final fc.a c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return od.a.e;
    }
}
