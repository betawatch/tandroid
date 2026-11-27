// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ja9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa9 b;

    public /* synthetic */ ja9(pa9 pa9Var, byte b) {
        this.a = b;
        this.b = pa9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pa9 pa9Var = this.b;
        switch (b) {
            case 0:
                oa9 oa9Var = pa9Var.a;
                if (oa9Var != null) {
                    oa9Var.u();
                    break;
                }
                break;
            case 1:
                pa9Var.c.a(pa9Var.r);
                na9 na9Var = pa9Var.d;
                na9Var.getClass();
                na9Var.postRunnable(new ma9(na9Var, (byte) 1));
                pa9Var.d = null;
                break;
            default:
                pa9Var.c.q(pa9Var.y);
                break;
        }
    }
}
