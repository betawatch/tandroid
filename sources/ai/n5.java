package ai;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ((ac) this.b.l.Q1).g(false);
                break;
            case 1:
                f6 f6Var = this.b.l;
                y5 y5Var = f6Var.Q1;
                if (y5Var != null) {
                    jc jcVar = ((ac) y5Var).d;
                    jcVar.Z0 = false;
                    jcVar.P();
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
