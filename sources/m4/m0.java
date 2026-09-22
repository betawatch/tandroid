package m4;

import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements d1, e1 {
    public final /* synthetic */ g1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ m0(g1 g1Var, int i10, int i11) {
        this.a = g1Var;
        this.b = i10;
        this.c = i11;
    }

    @Override // m4.e1
    public void a(k1 k1Var, r rVar, List list) {
        g1 g1Var = this.a;
        k1Var.P(g1Var.K0(rVar, k1Var, this.b), g1Var.K0(rVar, k1Var, this.c), list);
    }

    @Override // m4.d1
    public void g(k1 k1Var, r rVar) {
        g1 g1Var = this.a;
        k1Var.S(g1Var.K0(rVar, k1Var, this.b), g1Var.K0(rVar, k1Var, this.c));
    }
}
