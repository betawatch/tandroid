// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class nh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ph0 b;

    public /* synthetic */ nh0(ph0 ph0Var, byte b) {
        this.a = b;
        this.b = ph0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ph0 ph0Var = this.b;
        switch (b) {
            case 0:
                ph0Var.a(null, false);
                break;
            default:
                ph0Var.b(true);
                break;
        }
    }
}
