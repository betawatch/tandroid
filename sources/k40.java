// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class k40 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lx6 b;
    public final /* synthetic */ ia3 c;

    public /* synthetic */ k40(lx6 lx6Var, ia3 ia3Var, byte b) {
        this.a = b;
        this.b = lx6Var;
        this.c = ia3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lx6 lx6Var = this.b;
                ia3 ia3Var = this.c;
                synchronized (ia3Var) {
                }
                o40 o40Var = (o40) lx6Var.c;
                String str = hac.a;
                xa3 xa3Var = ((c74) o40Var).a.s;
                tk R = xa3Var.R((rz6) xa3Var.d.e);
                xa3Var.V(R, 1013, new ua3(R, ia3Var, (byte) 8));
                break;
            default:
                lx6 lx6Var2 = this.b;
                ia3 ia3Var2 = this.c;
                o40 o40Var2 = (o40) lx6Var2.c;
                String str2 = hac.a;
                xa3 xa3Var2 = ((c74) o40Var2).a.s;
                tk U = xa3Var2.U();
                xa3Var2.V(U, 1007, new ua3(U, ia3Var2, (byte) 3));
                break;
        }
    }
}
