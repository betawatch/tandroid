// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class hi7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi7 b;

    public /* synthetic */ hi7(pi7 pi7Var, byte b) {
        this.a = b;
        this.b = pi7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pi7 pi7Var = this.b;
        switch (b) {
            case 0:
                pi7Var.dismiss();
                break;
            case 1:
                pi7Var.c1(true, false);
                break;
            default:
                pi7Var.c1(true, false);
                break;
        }
    }
}
