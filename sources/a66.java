// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a66 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e66 b;

    public /* synthetic */ a66(e66 e66Var, byte b) {
        this.a = b;
        this.b = e66Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e66 e66Var = this.b;
        switch (b) {
            case 0:
                e66Var.b();
                break;
            default:
                e66Var.c();
                break;
        }
    }
}
