package bi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ g1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n1 n1Var = this.b;
                u4 u4Var = n1Var.C2;
                if (u4Var != null && n1Var.Z1 != null) {
                    n1Var.D2 = true;
                    u4Var.b().a.m(false);
                    try {
                        n1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((a3) n1Var.Z1).a(n1Var, n1Var.C2, true);
                    break;
                }
                break;
            case 1:
                this.b.J();
                break;
            default:
                this.b.O();
                break;
        }
    }
}
