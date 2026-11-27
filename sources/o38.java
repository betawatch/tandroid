// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class o38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a48 b;

    public /* synthetic */ o38(a48 a48Var, byte b) {
        this.a = b;
        this.b = a48Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a48 a48Var = this.b;
        switch (b) {
            case 0:
                if (a48Var.H) {
                    a48Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                a48Var.h();
                break;
            default:
                int i = a48.r0;
                a48Var.h();
                break;
        }
    }
}
