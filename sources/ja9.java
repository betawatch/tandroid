// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ja9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa9 b;

    public /* synthetic */ ja9(pa9 pa9Var, byte b) {
        this.a = b;
        this.b = pa9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pa9 pa9Var = this.b;
        switch (b) {
            case 0:
                oa9 oa9Var = pa9Var.a;
                if (oa9Var != null) {
                    oa9Var.u();
                    break;
                }
                break;
            case 1:
                pa9Var.c.a(pa9Var.r);
                na9 na9Var = pa9Var.d;
                na9Var.getClass();
                na9Var.postRunnable(new ma9(na9Var, (byte) 1));
                pa9Var.d = null;
                break;
            default:
                pa9Var.c.q(pa9Var.y);
                break;
        }
    }
}
