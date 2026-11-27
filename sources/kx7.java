// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx7 b;

    public /* synthetic */ kx7(nx7 nx7Var, byte b) {
        this.a = b;
        this.b = nx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.c = null;
                xh4 xh4Var = nx7Var.a;
                if (xh4Var != null) {
                    xh4Var.v();
                    break;
                }
                break;
            default:
                nx7Var.b();
                break;
        }
    }
}
