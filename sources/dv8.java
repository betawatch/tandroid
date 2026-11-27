// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dv8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gv8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ dv8(gv8 gv8Var, int i, byte b) {
        this.a = b;
        this.b = gv8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        gv8 gv8Var = this.b;
        switch (b) {
            case 0:
                gv8Var.b.e(i, gv8Var.d.i(i));
                break;
            default:
                gv8Var.b.e(i, gv8Var.d.i(i));
                break;
        }
    }
}
