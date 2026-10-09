package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class r1 extends fe.b {
    public final m1 b;
    public x1 c;
    public final /* synthetic */ w1 d;
    public final /* synthetic */ c1 e;

    public r1(m1 m1Var, w1 w1Var, c1 c1Var) {
        this.d = w1Var;
        this.e = c1Var;
        this.b = m1Var;
    }

    @Override // fe.b
    public final void b(Object obj, Object obj2) {
        fe.k kVar = (fe.k) obj;
        boolean z10 = obj2 == null;
        fe.k kVar2 = this.b;
        fe.k kVar3 = z10 ? kVar2 : this.c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.k.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                fe.k kVar4 = this.c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar2.e(kVar4);
            }
        }
    }

    @Override // fe.b
    public final da.a c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return fe.a.e;
    }
}
