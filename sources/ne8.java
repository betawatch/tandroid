// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new ne8(ve8Var, (byte) 3));
                gb2 gb2Var = ve8Var.M;
                if (gb2Var != null) {
                    gb2Var.setVisibility(0);
                    gb2 gb2Var2 = ve8Var.M;
                    gb2Var2.d6 = null;
                    gb2Var2.invalidate();
                }
                ft1 ft1Var = ve8Var.f0;
                if (ft1Var != null) {
                    gl.d3(ft1Var);
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
