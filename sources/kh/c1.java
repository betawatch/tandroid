package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ c1(d1 d1Var, int i9) {
        this.a = i9;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                if (d1Var.G > 0) {
                    d1Var.dualToggleShape();
                    try {
                        d1Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                d1 d1Var2 = this.b;
                d1Var2.focusToPoint((int) d1Var2.E, (int) d1Var2.F);
                break;
        }
    }
}
