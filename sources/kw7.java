// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
