// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
