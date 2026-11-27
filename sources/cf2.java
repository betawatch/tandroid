// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cf2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bg2 b;

    public /* synthetic */ cf2(bg2 bg2Var, byte b) {
        this.a = b;
        this.b = bg2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bg2 bg2Var = this.b;
        switch (b) {
            case 0:
                bg2Var.t0();
                break;
            default:
                bg2Var.getMessagesController().e3(0, bg2Var.N, true);
                break;
        }
    }
}
