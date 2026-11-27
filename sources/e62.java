// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class e62 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a72 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e62(a72 a72Var, int i, byte b) {
        this.a = b;
        this.b = a72Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.g0(i, null);
                break;
            case 1:
                a72Var.c0(i);
                break;
            default:
                a72Var.g0(i, null);
                break;
        }
    }
}
