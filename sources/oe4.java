// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oe4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf4 b;

    public /* synthetic */ oe4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                nf4Var.o0();
                break;
            default:
                nf4Var.n0();
                break;
        }
    }
}
