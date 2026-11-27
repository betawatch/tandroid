// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class nh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ph0 b;

    public /* synthetic */ nh0(ph0 ph0Var, byte b) {
        this.a = b;
        this.b = ph0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ph0 ph0Var = this.b;
        switch (b) {
            case 0:
                ph0Var.a(null, false);
                break;
            default:
                ph0Var.b(true);
                break;
        }
    }
}
