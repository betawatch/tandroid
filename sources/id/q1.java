package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q1 extends nd.b {
    public final l1 b;
    public w1 c;
    public final /* synthetic */ v1 d;
    public final /* synthetic */ b1 e;

    public q1(l1 l1Var, v1 v1Var, b1 b1Var) {
        this.d = v1Var;
        this.e = b1Var;
        this.b = l1Var;
    }

    @Override // nd.b
    public final void b(Object obj, Object obj2) {
        nd.k kVar = (nd.k) obj;
        boolean z10 = obj2 == null;
        nd.k kVar2 = this.b;
        nd.k kVar3 = z10 ? kVar2 : this.c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.k.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                nd.k kVar4 = this.c;
                kotlin.jvm.internal.j.b(kVar4);
                kVar2.e(kVar4);
            }
        }
    }

    @Override // nd.b
    public final ec.a c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return nd.a.e;
    }
}
