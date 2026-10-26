package m4;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements f1, g1, e2.j {
    public final /* synthetic */ j1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ q0(j1 j1Var, int i10, int i11) {
        this.a = j1Var;
        this.b = i10;
        this.c = i11;
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

    @Override // m4.g1
    public void b(n1 n1Var, w wVar, List list) {
        j1 j1Var = this.a;
        n1Var.O(j1Var.K0(wVar, n1Var, this.b), j1Var.K0(wVar, n1Var, this.c), list);
    }

    @Override // m4.f1
    public void e(n1 n1Var, w wVar) {
        j1 j1Var = this.a;
        n1Var.R(j1Var.K0(wVar, n1Var, this.b), j1Var.K0(wVar, n1Var, this.c));
    }
}
