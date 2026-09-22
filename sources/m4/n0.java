package m4;

import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements d1, e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n0(g1 g1Var, int i10, int i11) {
        this.a = i11;
        this.b = g1Var;
        this.c = i10;
    }

    @Override // m4.e1
    public void a(k1 k1Var, r rVar, List list) {
        switch (this.a) {
            case 1:
                k1Var.b0(this.b.K0(rVar, k1Var, this.c), list);
                break;
            case 2:
                g1 g1Var = this.b;
                g1Var.getClass();
                int size = list.size();
                int i10 = this.c;
                if (size != 1) {
                    k1Var.P(g1Var.K0(rVar, k1Var, i10), g1Var.K0(rVar, k1Var, i10 + 1), list);
                    break;
                } else {
                    k1Var.s0((b2.k0) list.get(0), g1Var.K0(rVar, k1Var, i10));
                    break;
                }
            default:
                k1Var.b0(this.b.K0(rVar, k1Var, this.c), list);
                break;
        }
    }

    @Override // m4.d1
    public void g(k1 k1Var, r rVar) {
        switch (this.a) {
            case 0:
                k1Var.Y(this.b.K0(rVar, k1Var, this.c));
                break;
            default:
                k1Var.R(this.b.K0(rVar, k1Var, this.c));
                break;
        }
    }
}
