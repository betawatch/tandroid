// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class n30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lh2 b;
    public final /* synthetic */ qf5 c;

    public /* synthetic */ n30(lh2 lh2Var, qf5 qf5Var, byte b) {
        this.a = b;
        this.b = lh2Var;
        this.c = qf5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qf5 qf5Var = this.c;
        lh2 lh2Var = this.b;
        switch (b) {
            case 0:
                p30 p30Var = (p30) lh2Var.c;
                String str = gcc.a;
                ea3 ea3Var = ((n64) p30Var).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1032, new da3(U, qf5Var, (byte) 5));
                break;
            default:
                p30 p30Var2 = (p30) lh2Var.c;
                String str2 = gcc.a;
                ea3 ea3Var2 = ((n64) p30Var2).a.s;
                uj U2 = ea3Var2.U();
                ea3Var2.V(U2, 1031, new aa3(U2, qf5Var, (byte) 18));
                break;
        }
    }
}
