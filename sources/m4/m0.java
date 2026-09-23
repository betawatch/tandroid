package m4;

import java.util.List;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements y0, z0 {
    public final /* synthetic */ b1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ m0(b1 b1Var, int i10, int i11) {
        this.a = b1Var;
        this.b = i10;
        this.c = i11;
    }

    @Override // m4.z0
    public void a(f1 f1Var, r rVar, List list) {
        b1 b1Var = this.a;
        f1Var.P(b1Var.K0(rVar, f1Var, this.b), b1Var.K0(rVar, f1Var, this.c), list);
    }

    @Override // m4.y0
    public void g(f1 f1Var, r rVar) {
        b1 b1Var = this.a;
        f1Var.S(b1Var.K0(rVar, f1Var, this.b), b1Var.K0(rVar, f1Var, this.c));
    }
}
