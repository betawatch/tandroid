package m4;

import java.util.List;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements e1, f1, e2.j {
    public final /* synthetic */ i1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ q0(i1 i1Var, int i10, int i11) {
        this.a = i1Var;
        this.b = i10;
        this.c = i11;
    }

    @Override // e2.j
    public void accept(Object obj) {
        i1 i1Var = this.a;
        ((f0) i1Var.a.get()).getClass();
        h1 h1Var = i1Var.i;
        if (h1Var != null) {
            h1Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // m4.f1
    public void b(m1 m1Var, v vVar, List list) {
        i1 i1Var = this.a;
        m1Var.O(i1Var.K0(vVar, m1Var, this.b), i1Var.K0(vVar, m1Var, this.c), list);
    }

    @Override // m4.e1
    public void c(m1 m1Var, v vVar) {
        i1 i1Var = this.a;
        m1Var.R(i1Var.K0(vVar, m1Var, this.b), i1Var.K0(vVar, m1Var, this.c));
    }
}
