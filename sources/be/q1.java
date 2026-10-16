package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class q1 extends ge.b {
    public final l1 b;
    public w1 c;
    public final /* synthetic */ v1 d;
    public final /* synthetic */ b1 e;

    public q1(l1 l1Var, v1 v1Var, b1 b1Var) {
        this.d = v1Var;
        this.e = b1Var;
        this.b = l1Var;
    }

    @Override // ge.b
    public final void b(Object obj, Object obj2) {
        ge.k kVar = (ge.k) obj;
        boolean z10 = obj2 == null;
        l1 l1Var = this.b;
        b1 b1Var = z10 ? l1Var : this.c;
        if (b1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.k.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, b1Var)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                w1 w1Var = this.c;
                kotlin.jvm.internal.i.b(w1Var);
                l1Var.e(w1Var);
            }
        }
    }

    @Override // ge.b
    public final a6.i c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return ge.a.e;
    }
}
