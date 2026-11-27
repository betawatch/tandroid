// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ag6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bg6 b;

    public /* synthetic */ ag6(bg6 bg6Var, byte b) {
        this.a = b;
        this.b = bg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bg6 bg6Var = this.b;
        switch (b) {
            case 0:
                cg6 cg6Var = bg6Var.d;
                if (bg6Var.b) {
                    boolean z = cg6Var.M;
                    b29 b29Var = cg6Var.L;
                    di1 di1Var = cg6Var.n;
                    if (z && System.currentTimeMillis() - bg6Var.a >= 10000) {
                        di1Var.setAnimation(b29Var);
                        b29Var.I(0, false, false);
                        b29Var.u0 = new ag6(bg6Var, (byte) 1);
                        di1Var.d();
                        bg6Var.a = System.currentTimeMillis();
                    }
                    di1Var.postDelayed(bg6Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                hl.c3(new ag6(bg6Var, (byte) 2));
                break;
            default:
                cg6 cg6Var2 = bg6Var.d;
                b29 b29Var2 = cg6Var2.K;
                b29Var2.I(0, false, false);
                cg6Var2.n.setAnimation(b29Var2);
                break;
        }
    }
}
