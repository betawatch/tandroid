package m4;

import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements c1, d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m0(f1 f1Var, int i10, int i11) {
        this.a = i11;
        this.b = f1Var;
        this.c = i10;
    }

    @Override // m4.d1
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.a) {
            case 1:
                j1Var.b0(this.b.K0(rVar, j1Var, this.c), list);
                break;
            case 2:
                f1 f1Var = this.b;
                f1Var.getClass();
                int size = list.size();
                int i10 = this.c;
                if (size != 1) {
                    j1Var.P(f1Var.K0(rVar, j1Var, i10), f1Var.K0(rVar, j1Var, i10 + 1), list);
                    break;
                } else {
                    j1Var.s0((b2.k0) list.get(0), f1Var.K0(rVar, j1Var, i10));
                    break;
                }
            default:
                j1Var.b0(this.b.K0(rVar, j1Var, this.c), list);
                break;
        }
    }

    @Override // m4.c1
    public void j(j1 j1Var, r rVar) {
        switch (this.a) {
            case 0:
                j1Var.Y(this.b.K0(rVar, j1Var, this.c));
                break;
            default:
                j1Var.R(this.b.K0(rVar, j1Var, this.c));
                break;
        }
    }
}
