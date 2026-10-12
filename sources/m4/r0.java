package m4;

import java.util.List;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements f1, g1, e2.j {
    public final /* synthetic */ j1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ r0(j1 j1Var, int i10, int i11) {
        this.a = j1Var;
        this.b = i10;
        this.c = i11;
    }

    @Override // m4.g1
    public void a(n1 n1Var, w wVar, List list) {
        j1 j1Var = this.a;
        n1Var.O(j1Var.K0(wVar, n1Var, this.b), j1Var.K0(wVar, n1Var, this.c), list);
    }

    @Override // e2.j
    public void accept(Object obj) {
        j1 j1Var = this.a;
        ((f0) j1Var.a.get()).getClass();
        i1 i1Var = j1Var.i;
        if (i1Var != null) {
            i1Var.setFixedSize(this.b, this.c);
        }
    }

    @Override // m4.f1
    public void e(n1 n1Var, w wVar) {
        j1 j1Var = this.a;
        n1Var.R(j1Var.K0(wVar, n1Var, this.b), j1Var.K0(wVar, n1Var, this.c));
    }
}
