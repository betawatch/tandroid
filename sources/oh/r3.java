package oh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ r3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((z8) this.b.l.N1).g(false);
                break;
            case 1:
                f4 f4Var = this.b.l;
                z3 z3Var = f4Var.N1;
                if (z3Var != null) {
                    i9 i9Var = ((z8) z3Var).d;
                    i9Var.W0 = false;
                    i9Var.P();
                }
                f4Var.f1(false);
                f4Var.e3 = true;
                f4Var.H0.D(true);
                break;
            case 2:
                f4 f4Var2 = this.b.l;
                f4Var2.R3 = true;
                f4Var2.setActive(false);
                break;
            default:
                f4 f4Var3 = this.b.l;
                f4Var3.R3 = true;
                f4Var3.setActive(false);
                break;
        }
    }
}
