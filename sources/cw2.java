// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
