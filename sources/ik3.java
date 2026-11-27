// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ik3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ ik3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.X(false);
                break;
            default:
                nk3Var.O(true);
                break;
        }
    }
}
