package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q1 extends he.b {
    public final l1 b;
    public w1 c;
    public final /* synthetic */ v1 d;
    public final /* synthetic */ b1 e;

    public q1(l1 l1Var, v1 v1Var, b1 b1Var) {
        this.d = v1Var;
        this.e = b1Var;
        this.b = l1Var;
    }

    @Override // he.b
    public final void b(Object obj, Object obj2) {
        he.k kVar = (he.k) obj;
        boolean z10 = obj2 == null;
        he.k kVar2 = this.b;
        he.k kVar3 = z10 ? kVar2 : this.c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.k.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                he.k kVar4 = this.c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar2.e(kVar4);
            }
        }
    }

    @Override // he.b
    public final he.v c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return he.a.e;
    }
}
