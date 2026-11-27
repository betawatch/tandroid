// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dc6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc6 b;

    public /* synthetic */ dc6(uc6 uc6Var, byte b) {
        this.a = b;
        this.b = uc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        uc6 uc6Var = this.b;
        switch (b) {
            case 0:
                uc6Var.t0();
                break;
            case 1:
                sj5 sj5Var = uc6Var.G;
                if (sj5Var != null) {
                    uc6Var.F.h(sj5Var);
                    uc6Var.G = null;
                    break;
                }
                break;
            case 2:
                uc6Var.x0();
                break;
            case 3:
                uc6Var.getLocationController().o(0, uc6Var.m0, true);
                uc6Var.y = false;
                break;
            case 4:
                x05 x05Var = uc6Var.F;
                if (x05Var != null) {
                    x05Var.n(hl.L(70.0f), 0, hl.L(70.0f), uc6Var.n0());
                }
                if (!uc6Var.O.getRadiusSet()) {
                    double d = uc6Var.M;
                    ym4 ym4Var = uc6Var.L;
                    if (d > 0.0d) {
                        ym4Var.R0(d);
                    } else if (ym4Var != null) {
                        ym4Var.H0();
                        uc6Var.L = null;
                    }
                }
                uc6Var.O = null;
                break;
            case 5:
                uc6Var.D0();
                break;
            case 6:
                uc6Var.D0();
                break;
            default:
                hl.c3(new dc6(uc6Var, b2));
                break;
        }
    }
}
