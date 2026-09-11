package m4;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
