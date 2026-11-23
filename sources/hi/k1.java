package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ k1(l1 l1Var, int i7) {
        this.a = i7;
        this.b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                if (l1Var.L > 0) {
                    l1Var.dualToggleShape();
                    try {
                        l1Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                l1 l1Var2 = this.b;
                l1Var2.focusToPoint((int) l1Var2.J, (int) l1Var2.K);
                break;
        }
    }
}
