// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ff4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hf4 b;

    public /* synthetic */ ff4(hf4 hf4Var, byte b) {
        this.a = b;
        this.b = hf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hf4 hf4Var = this.b;
        switch (b) {
            case 0:
                hf4Var.d();
                break;
            case 1:
                hf4Var.a();
                break;
            default:
                hf4Var.b(hf4Var.E);
                break;
        }
    }
}
