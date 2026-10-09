package ai;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ n5(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((bc) this.b.l.Q1).g(false);
                break;
            case 1:
                f6 f6Var = this.b.l;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    kc kcVar = ((bc) y5Var).d;
                    kcVar.Z0 = false;
                    kcVar.P();
                }
                f6Var.f1(false);
                f6Var.h3 = true;
                f6Var.K0.D(true);
                break;
            case 2:
                f6 f6Var2 = this.b.l;
                f6Var2.U3 = true;
                f6Var2.setActive(false);
                break;
            default:
                f6 f6Var3 = this.b.l;
                f6Var3.U3 = true;
                f6Var3.setActive(false);
                break;
        }
    }
}
