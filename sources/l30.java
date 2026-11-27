// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class l30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lh2 b;
    public final /* synthetic */ p93 c;

    public /* synthetic */ l30(lh2 lh2Var, p93 p93Var, byte b) {
        this.a = b;
        this.b = lh2Var;
        this.c = p93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lh2 lh2Var = this.b;
                p93 p93Var = this.c;
                synchronized (p93Var) {
                }
                p30 p30Var = (p30) lh2Var.c;
                String str = gcc.a;
                ea3 ea3Var = ((n64) p30Var).a.s;
                uj R = ea3Var.R((vz6) ea3Var.d.e);
                ea3Var.V(R, 1013, new aa3(R, p93Var, (byte) 13));
                break;
            default:
                lh2 lh2Var2 = this.b;
                p93 p93Var2 = this.c;
                p30 p30Var2 = (p30) lh2Var2.c;
                String str2 = gcc.a;
                ea3 ea3Var2 = ((n64) p30Var2).a.s;
                uj U = ea3Var2.U();
                ea3Var2.V(U, 1007, new aa3(U, p93Var2, (byte) 8));
                break;
        }
    }
}
