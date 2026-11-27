// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class en0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tn0 b;

    public /* synthetic */ en0(tn0 tn0Var, byte b) {
        this.a = b;
        this.b = tn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tn0 tn0Var = this.b;
        switch (b) {
            case 0:
                tn0Var.a(null);
                break;
            default:
                hl.c3(new en0(tn0Var, (byte) 0));
                break;
        }
    }
}
