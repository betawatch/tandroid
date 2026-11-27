// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class i72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zt3 b;

    public /* synthetic */ i72(zt3 zt3Var, byte b) {
        this.a = b;
        this.b = zt3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zt3 zt3Var = this.b;
        switch (b) {
            case 0:
                yt3 yt3Var = zt3Var.d;
                yt3Var.requestFocus();
                hl.E3(yt3Var);
                break;
            default:
                hl.t1(zt3Var.d);
                break;
        }
    }
}
