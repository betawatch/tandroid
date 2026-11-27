// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o29 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ e29 c;

    public /* synthetic */ o29(jo0 jo0Var, e29 e29Var, byte b) {
        this.a = b;
        this.b = jo0Var;
        this.c = e29Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e29 e29Var = this.c;
        jo0 jo0Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new o29(jo0Var, e29Var, (byte) 1));
                break;
            default:
                jo0Var.removeView(e29Var);
                break;
        }
    }
}
