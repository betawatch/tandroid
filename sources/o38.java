// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a48 b;

    public /* synthetic */ o38(a48 a48Var, byte b) {
        this.a = b;
        this.b = a48Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a48 a48Var = this.b;
        switch (b) {
            case 0:
                if (a48Var.H) {
                    a48Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                a48Var.h();
                break;
            default:
                int i = a48.r0;
                a48Var.h();
                break;
        }
    }
}
