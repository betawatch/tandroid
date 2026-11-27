// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l81 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ l81(i91 i91Var, byte b) {
        this.a = b;
        this.b = i91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i91 i91Var = this.b;
        switch (b) {
            case 0:
                i91Var.k0(false);
                break;
            default:
                i91Var.b0();
                break;
        }
    }
}
