package m4;

import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        f1Var.P(b1Var.J0(rVar, f1Var, this.b), b1Var.J0(rVar, f1Var, this.c), list);
    }

    @Override // m4.y0
    public void g(f1 f1Var, r rVar) {
        b1 b1Var = this.a;
        f1Var.S(b1Var.J0(rVar, f1Var, this.b), b1Var.J0(rVar, f1Var, this.c));
    }
}
