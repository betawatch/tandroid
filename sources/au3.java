// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class au3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cu3 b;

    public /* synthetic */ au3(cu3 cu3Var, byte b) {
        this.a = b;
        this.b = cu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cu3 cu3Var = this.b;
        switch (b) {
            case 0:
                cu3Var.post(new au3(cu3Var, (byte) 1));
                break;
            default:
                cu3Var.h();
                cu3Var.d();
                break;
        }
    }
}
