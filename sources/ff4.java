// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ff4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hf4 b;

    public /* synthetic */ ff4(hf4 hf4Var, byte b) {
        this.a = b;
        this.b = hf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hf4 hf4Var = this.b;
        switch (b) {
            case 0:
                hf4Var.d();
                break;
            case 1:
                hf4Var.a();
                break;
            default:
                hf4Var.b(hf4Var.E);
                break;
        }
    }
}
