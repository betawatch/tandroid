package o4;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements d1, e1, g2.k {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ p0(h1 h1Var, int i3, int i10) {
        this.a = h1Var;
        this.b = i3;
        this.c = i10;
    }

    @Override // g2.k
    public void accept(Object obj) {
        h1 h1Var = this.a;
        ((e0) h1Var.a.get()).getClass();
        g1 g1Var = h1Var.i;
        if (g1Var != null) {
            g1Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // o4.d1
    public void b(l1 l1Var, v vVar) {
        h1 h1Var = this.a;
        l1Var.P(h1Var.M0(vVar, l1Var, this.b), h1Var.M0(vVar, l1Var, this.c));
    }

    @Override // o4.e1
    public void c(l1 l1Var, v vVar, List list) {
        h1 h1Var = this.a;
        l1Var.p0(list, h1Var.M0(vVar, l1Var, this.b), h1Var.M0(vVar, l1Var, this.c));
    }
}
