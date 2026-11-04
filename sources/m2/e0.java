package m2;

import o4.l1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements g2.p, g2.k {
    public final /* synthetic */ long a;

    public /* synthetic */ e0(long j10) {
        this.a = j10;
    }

    @Override // g2.k
    public void accept(Object obj) {
        ((l1) obj).f(this.a);
    }

    @Override // g2.p
    public void invoke(Object obj) {
        x xVar;
        o0 o0Var = (o0) obj;
        s0 s0Var = o0Var.b;
        if (o0Var.equals(s0Var.j) && (xVar = s0Var.n) != null) {
            xVar.g(this.a);
        }
    }
}
