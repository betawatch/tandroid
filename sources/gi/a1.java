package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ a1(b1 b1Var, int i3) {
        this.a = i3;
        this.b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                if (b1Var.L > 0) {
                    b1Var.dualToggleShape();
                    try {
                        b1Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                b1 b1Var2 = this.b;
                b1Var2.focusToPoint((int) b1Var2.J, (int) b1Var2.K);
                break;
        }
    }
}
