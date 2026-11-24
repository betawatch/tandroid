// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kq1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lq1 b;

    public /* synthetic */ kq1(lq1 lq1Var, byte b) {
        this.a = b;
        this.b = lq1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lq1 lq1Var = this.b;
        switch (b) {
            case 0:
                lq1Var.W = null;
                mu1 mu1Var = lq1Var.X;
                if (mu1Var.ea != -1) {
                    mu1Var.getNotificationCenter().j(mu1Var.ea);
                    mu1Var.ea = -1;
                }
                if (w01.a) {
                    fa4.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                lq1Var.W = null;
                mu1 mu1Var2 = lq1Var.X;
                if (mu1Var2.ea != -1) {
                    mu1Var2.getNotificationCenter().j(mu1Var2.ea);
                    mu1Var2.ea = -1;
                }
                if (w01.a) {
                    fa4.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
