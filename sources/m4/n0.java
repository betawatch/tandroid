package m4;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements e1, f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n0(h1 h1Var, int i10, int i11) {
        this.a = i11;
        this.b = h1Var;
        this.c = i10;
    }

    @Override // m4.f1
    public void a(l1 l1Var, r rVar, List list) {
        switch (this.a) {
            case 1:
                l1Var.b0(this.b.K0(rVar, l1Var, this.c), list);
                break;
            case 2:
                h1 h1Var = this.b;
                h1Var.getClass();
                int size = list.size();
                int i10 = this.c;
                if (size != 1) {
                    l1Var.P(h1Var.K0(rVar, l1Var, i10), h1Var.K0(rVar, l1Var, i10 + 1), list);
                    break;
                } else {
                    l1Var.s0((b2.k0) list.get(0), h1Var.K0(rVar, l1Var, i10));
                    break;
                }
            default:
                l1Var.b0(this.b.K0(rVar, l1Var, this.c), list);
                break;
        }
    }

    @Override // m4.e1
    public void e(l1 l1Var, r rVar) {
        switch (this.a) {
            case 0:
                l1Var.Y(this.b.K0(rVar, l1Var, this.c));
                break;
            default:
                l1Var.R(this.b.K0(rVar, l1Var, this.c));
                break;
        }
    }
}
