package m4;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements e1, f1 {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ m0(h1 h1Var, int i10, int i11) {
        this.a = h1Var;
        this.b = i10;
        this.c = i11;
    }

    @Override // m4.f1
    public void a(l1 l1Var, r rVar, List list) {
        h1 h1Var = this.a;
        l1Var.P(h1Var.K0(rVar, l1Var, this.b), h1Var.K0(rVar, l1Var, this.c), list);
    }

    @Override // m4.e1
    public void e(l1 l1Var, r rVar) {
        h1 h1Var = this.a;
        l1Var.S(h1Var.K0(rVar, l1Var, this.b), h1Var.K0(rVar, l1Var, this.c));
    }
}
