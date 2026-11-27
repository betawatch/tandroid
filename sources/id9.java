// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class id9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ld9 b;

    public /* synthetic */ id9(ld9 ld9Var, byte b) {
        this.a = b;
        this.b = ld9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ld9 ld9Var = this.b;
        switch (b) {
            case 0:
                ed9 ed9Var = ld9Var.c;
                if (!ed9Var.k.isEmpty()) {
                    ed9Var.k.clear();
                    ed9Var.p();
                    break;
                }
                break;
            case 1:
                ed9 ed9Var2 = ld9Var.c;
                if (!ed9Var2.l.isEmpty()) {
                    ed9Var2.l.clear();
                    ed9Var2.p();
                    break;
                }
                break;
            case 2:
                ed9 ed9Var3 = ld9Var.c;
                if (!ed9Var3.m.isEmpty()) {
                    ed9Var3.m.clear();
                    ed9Var3.p();
                    break;
                }
                break;
            case 3:
                ld9Var.c.t(dd9.a);
                break;
            case 4:
                ld9Var.c.t(dd9.b);
                break;
            default:
                ld9Var.c.t(dd9.c);
                break;
        }
    }
}
