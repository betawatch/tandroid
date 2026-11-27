// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class en0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tn0 b;

    public /* synthetic */ en0(tn0 tn0Var, byte b) {
        this.a = b;
        this.b = tn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tn0 tn0Var = this.b;
        switch (b) {
            case 0:
                tn0Var.a(null);
                break;
            default:
                hl.c3(new en0(tn0Var, (byte) 0));
                break;
        }
    }
}
