// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ht4 b;

    public /* synthetic */ gt4(ht4 ht4Var, byte b) {
        this.a = b;
        this.b = ht4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ht4 ht4Var = this.b;
        switch (b) {
            case 0:
                if (ht4Var.d.K == ht4Var) {
                    ht4Var.d.a0 = false;
                    ht4Var.d.b0 = null;
                    ht4Var.d.h();
                    break;
                }
                break;
            default:
                if (ht4Var.d.K == ht4Var && !ht4Var.b) {
                    ht4Var.d.a0 = true;
                    Runnable runnable = ht4Var.d.b0;
                    ht4Var.d.b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
