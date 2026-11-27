// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cw2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw2 b;

    public /* synthetic */ cw2(rw2 rw2Var, byte b) {
        this.a = b;
        this.b = rw2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rw2 rw2Var = this.b;
        switch (b) {
            case 0:
                rw2Var.c0 = null;
                break;
            case 1:
                rw2Var.A.g0(null);
                qx7 qx7Var = rw2Var.C;
                if (qx7Var != null) {
                    qx7Var.a();
                    rw2Var.z.removeView(rw2Var.C);
                    rw2Var.C = null;
                    break;
                }
                break;
            default:
                rw2Var.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(k43.h).start();
                break;
        }
    }
}
