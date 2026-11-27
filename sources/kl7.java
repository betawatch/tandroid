// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rl7 b;

    public /* synthetic */ kl7(rl7 rl7Var, byte b) {
        this.a = b;
        this.b = rl7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rl7 rl7Var = this.b;
        switch (b) {
            case 0:
                hl.t1(rl7Var.l1);
                break;
            default:
                hl.E3(rl7Var.m1.getEditText());
                break;
        }
    }
}
