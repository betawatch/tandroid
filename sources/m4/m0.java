package m4;

import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements x0, y0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m0(a1 a1Var, int i10, int i11) {
        this.a = i11;
        this.b = a1Var;
        this.c = i10;
    }

    @Override // m4.y0
    public void a(e1 e1Var, r rVar, List list) {
        switch (this.a) {
            case 1:
                e1Var.b0(this.b.K0(rVar, e1Var, this.c), list);
                break;
            case 2:
                a1 a1Var = this.b;
                a1Var.getClass();
                int size = list.size();
                int i10 = this.c;
                if (size != 1) {
                    e1Var.P(a1Var.K0(rVar, e1Var, i10), a1Var.K0(rVar, e1Var, i10 + 1), list);
                    break;
                } else {
                    e1Var.s0((b2.k0) list.get(0), a1Var.K0(rVar, e1Var, i10));
                    break;
                }
            default:
                e1Var.b0(this.b.K0(rVar, e1Var, this.c), list);
                break;
        }
    }

    @Override // m4.x0
    public void d(e1 e1Var, r rVar) {
        switch (this.a) {
            case 0:
                e1Var.Y(this.b.K0(rVar, e1Var, this.c));
                break;
            default:
                e1Var.R(this.b.K0(rVar, e1Var, this.c));
                break;
        }
    }
}
