// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class oe4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf4 b;

    public /* synthetic */ oe4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                nf4Var.o0();
                break;
            default:
                nf4Var.n0();
                break;
        }
    }
}
