// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class eb6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ eb6(ob6 ob6Var, int i, byte b) {
        this.a = b;
        this.b = ob6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ob6 ob6Var = this.b;
        switch (b) {
            case 0:
                ob6Var.P = false;
                ob6Var.j(i);
                break;
            case 1:
                ob6Var.P = false;
                ob6Var.j(i);
                break;
            case 2:
                ob6Var.Z0(i, null, true, null);
                break;
            default:
                ob6Var.Z0(i, null, true, null);
                break;
        }
    }
}
