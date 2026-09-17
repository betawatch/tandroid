package di;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ c1(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                if (d1Var.K > 0) {
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
                d1Var2.focusToPoint((int) d1Var2.I, (int) d1Var2.J);
                break;
        }
    }
}
