// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cr4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dr4 b;

    public /* synthetic */ cr4(dr4 dr4Var, byte b) {
        this.a = b;
        this.b = dr4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dr4 dr4Var = this.b;
        switch (b) {
            case 0:
                if (dr4Var.d.K == dr4Var) {
                    dr4Var.d.a0 = false;
                    dr4Var.d.b0 = null;
                    dr4Var.d.h();
                    break;
                }
                break;
            default:
                if (dr4Var.d.K == dr4Var && !dr4Var.b) {
                    dr4Var.d.a0 = true;
                    Runnable runnable = dr4Var.d.b0;
                    dr4Var.d.b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
