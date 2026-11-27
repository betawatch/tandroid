// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i57 b;

    public /* synthetic */ h57(i57 i57Var, byte b) {
        this.a = b;
        this.b = i57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i57 i57Var = this.b;
        switch (b) {
            case 0:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    break;
                }
                break;
            case 1:
                i57Var.Y.i();
                break;
            default:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    break;
                }
                break;
        }
    }
}
