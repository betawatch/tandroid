// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc9 b;

    public /* synthetic */ hc9(mc9 mc9Var, byte b) {
        this.a = b;
        this.b = mc9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mc9 mc9Var = this.b;
        switch (b) {
            case 0:
                mf9 mf9Var = mc9Var.L2;
                if (mf9Var != null && mc9Var.f2 != null) {
                    mc9Var.M2 = true;
                    mf9Var.b().a.m(false);
                    try {
                        mc9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((wd9) mc9Var.f2).a(mc9Var, mc9Var.L2, true);
                    break;
                }
                break;
            case 1:
                mc9Var.K();
                break;
            default:
                mc9Var.P();
                break;
        }
    }
}
