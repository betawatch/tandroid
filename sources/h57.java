// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class h57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i57 b;

    public /* synthetic */ h57(i57 i57Var, byte b) {
        this.a = b;
        this.b = i57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i57 i57Var = this.b;
        switch (b) {
            case 0:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    break;
                }
                break;
            case 1:
                i57Var.Y.i();
                break;
            default:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    break;
                }
                break;
        }
    }
}
