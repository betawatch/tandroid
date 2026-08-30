package nh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ q3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((z8) this.b.l.N1).g(false);
                break;
            case 1:
                d4 d4Var = this.b.l;
                x3 x3Var = d4Var.N1;
                if (x3Var != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.W0 = false;
                    i9Var.P();
                }
                d4Var.f1(false);
                d4Var.e3 = true;
                d4Var.H0.D(true);
                break;
            case 2:
                d4 d4Var2 = this.b.l;
                d4Var2.R3 = true;
                d4Var2.setActive(false);
                break;
            default:
                d4 d4Var3 = this.b.l;
                d4Var3.R3 = true;
                d4Var3.setActive(false);
                break;
        }
    }
}
