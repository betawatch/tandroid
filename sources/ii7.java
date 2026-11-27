// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ii7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qi7 b;

    public /* synthetic */ ii7(qi7 qi7Var, byte b) {
        this.a = b;
        this.b = qi7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qi7 qi7Var = this.b;
        switch (b) {
            case 0:
                qi7Var.dismiss();
                break;
            case 1:
                qi7Var.c1(true, false);
                break;
            default:
                qi7Var.c1(true, false);
                break;
        }
    }
}
