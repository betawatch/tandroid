package m4;

import java.util.List;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements f1, g1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ s0(j1 j1Var, int i10, int i11) {
        this.a = i11;
        this.b = j1Var;
        this.c = i10;
    }

    @Override // m4.g1
    public void a(n1 n1Var, w wVar, List list) {
        switch (this.a) {
            case 1:
                n1Var.b0(this.b.K0(wVar, n1Var, this.c), list);
                break;
            case 2:
                j1 j1Var = this.b;
                j1Var.getClass();
                int size = list.size();
                int i10 = this.c;
                if (size != 1) {
                    n1Var.O(j1Var.K0(wVar, n1Var, i10), j1Var.K0(wVar, n1Var, i10 + 1), list);
                    break;
                } else {
                    n1Var.u0((b2.p0) list.get(0), j1Var.K0(wVar, n1Var, i10));
                    break;
                }
            default:
                n1Var.b0(this.b.K0(wVar, n1Var, this.c), list);
                break;
        }
    }

    @Override // m4.f1
    public void e(n1 n1Var, w wVar) {
        switch (this.a) {
            case 0:
                n1Var.Y(this.b.K0(wVar, n1Var, this.c));
                break;
            default:
                n1Var.Q(this.b.K0(wVar, n1Var, this.c));
                break;
        }
    }
}
