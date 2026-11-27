// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
