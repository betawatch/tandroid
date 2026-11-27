// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class au3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cu3 b;

    public /* synthetic */ au3(cu3 cu3Var, byte b) {
        this.a = b;
        this.b = cu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cu3 cu3Var = this.b;
        switch (b) {
            case 0:
                cu3Var.post(new au3(cu3Var, (byte) 1));
                break;
            default:
                cu3Var.h();
                cu3Var.d();
                break;
        }
    }
}
