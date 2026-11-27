// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kw7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx7 b;
    public final /* synthetic */ pp9 c;

    public /* synthetic */ kw7(dx7 dx7Var, pp9 pp9Var, byte b) {
        this.a = b;
        this.b = dx7Var;
        this.c = pp9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pp9 pp9Var = this.c;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.C0(pp9Var, true);
                break;
            default:
                dx7Var.B0(pp9Var);
                break;
        }
    }
}
