// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class hr3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ir3 b;

    public /* synthetic */ hr3(ir3 ir3Var, byte b) {
        this.a = b;
        this.b = ir3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ir3 ir3Var = this.b;
        switch (b) {
            case 0:
                if (ir3Var.L > 0) {
                    ir3Var.dualToggleShape();
                    try {
                        ir3Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                ir3Var.focusToPoint((int) ir3Var.J, (int) ir3Var.K);
                break;
        }
    }
}
