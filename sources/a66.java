// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a66 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e66 b;

    public /* synthetic */ a66(e66 e66Var, byte b) {
        this.a = b;
        this.b = e66Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e66 e66Var = this.b;
        switch (b) {
            case 0:
                e66Var.b();
                break;
            default:
                e66Var.c();
                break;
        }
    }
}
