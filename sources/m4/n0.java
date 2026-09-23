package m4;

import java.util.List;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements y0, z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n0(b1 b1Var, int i10, int i11) {
        this.a = i11;
        this.b = b1Var;
        this.c = i10;
    }

    @Override // m4.z0
    public void a(f1 f1Var, r rVar, List list) {
        switch (this.a) {
            case 1:
                f1Var.b0(this.b.K0(rVar, f1Var, this.c), list);
                break;
            case 2:
                b1 b1Var = this.b;
                b1Var.getClass();
                int size = list.size();
                int i10 = this.c;
                if (size != 1) {
                    f1Var.P(b1Var.K0(rVar, f1Var, i10), b1Var.K0(rVar, f1Var, i10 + 1), list);
                    break;
                } else {
                    f1Var.s0((b2.k0) list.get(0), b1Var.K0(rVar, f1Var, i10));
                    break;
                }
            default:
                f1Var.b0(this.b.K0(rVar, f1Var, this.c), list);
                break;
        }
    }

    @Override // m4.y0
    public void g(f1 f1Var, r rVar) {
        switch (this.a) {
            case 0:
                f1Var.Y(this.b.K0(rVar, f1Var, this.c));
                break;
            default:
                f1Var.R(this.b.K0(rVar, f1Var, this.c));
                break;
        }
    }
}
