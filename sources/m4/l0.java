package m4;

import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements c1, d1 {
    public final /* synthetic */ f1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ l0(f1 f1Var, int i10, int i11) {
        this.a = f1Var;
        this.b = i10;
        this.c = i11;
    }

    @Override // m4.d1
    public void a(j1 j1Var, r rVar, List list) {
        f1 f1Var = this.a;
        j1Var.P(f1Var.K0(rVar, j1Var, this.b), f1Var.K0(rVar, j1Var, this.c), list);
    }

    @Override // m4.c1
    public void j(j1 j1Var, r rVar) {
        f1 f1Var = this.a;
        j1Var.S(f1Var.K0(rVar, j1Var, this.b), f1Var.K0(rVar, j1Var, this.c));
    }
}
