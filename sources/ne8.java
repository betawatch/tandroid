// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ne8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ve8 b;

    public /* synthetic */ ne8(ve8 ve8Var, boolean z) {
        this.a = (byte) 0;
        this.b = ve8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ve8 ve8Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new ne8(ve8Var, (byte) 3));
                gb2 gb2Var = ve8Var.M;
                if (gb2Var != null) {
                    gb2Var.setVisibility(0);
                    gb2 gb2Var2 = ve8Var.M;
                    gb2Var2.d6 = null;
                    gb2Var2.invalidate();
                }
                ft1 ft1Var = ve8Var.f0;
                if (ft1Var != null) {
                    gl.c3(ft1Var);
                    ve8Var.f0 = null;
                    break;
                }
                break;
            case 1:
                ve8Var.b(false);
                break;
            case 2:
                ve8Var.b(false);
                break;
            default:
                ve8Var.c();
                break;
        }
    }

    public /* synthetic */ ne8(ve8 ve8Var, byte b) {
        this.a = b;
        this.b = ve8Var;
    }
}
