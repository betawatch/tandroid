// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv2 b;

    public /* synthetic */ iv2(xv2 xv2Var, byte b) {
        this.a = b;
        this.b = xv2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xv2 xv2Var = this.b;
        switch (b) {
            case 0:
                xv2Var.c0 = null;
                break;
            case 1:
                xv2Var.A.g0(null);
                ju7 ju7Var = xv2Var.C;
                if (ju7Var != null) {
                    ju7Var.a();
                    xv2Var.z.removeView(xv2Var.C);
                    xv2Var.C = null;
                    break;
                }
                break;
            default:
                xv2Var.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(s33.h).start();
                break;
        }
    }
}
