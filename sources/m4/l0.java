package m4;

import java.util.List;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements x0, y0 {
    public final /* synthetic */ a1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ l0(a1 a1Var, int i10, int i11) {
        this.a = a1Var;
        this.b = i10;
        this.c = i11;
    }

    @Override // m4.y0
    public void a(e1 e1Var, r rVar, List list) {
        a1 a1Var = this.a;
        e1Var.P(a1Var.K0(rVar, e1Var, this.b), a1Var.K0(rVar, e1Var, this.c), list);
    }

    @Override // m4.x0
    public void d(e1 e1Var, r rVar) {
        a1 a1Var = this.a;
        e1Var.S(a1Var.K0(rVar, e1Var, this.b), a1Var.K0(rVar, e1Var, this.c));
    }
}
