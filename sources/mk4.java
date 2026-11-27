// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rk4 b;
    public final /* synthetic */ sh9 c;

    public /* synthetic */ mk4(rk4 rk4Var, sh9 sh9Var, byte b) {
        this.a = b;
        this.b = rk4Var;
        this.c = sh9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sh9 sh9Var = this.c;
        rk4 rk4Var = this.b;
        rk4Var.getClass();
        switch (b) {
            case 0:
                hl.d3(new mk4(rk4Var, sh9Var, (byte) 1), 320L);
                break;
            default:
                sh9Var.a(new zj3(rk4Var, (byte) 9));
                break;
        }
    }
}
