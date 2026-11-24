// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class j40 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lx6 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j40(lx6 lx6Var, Exception exc, byte b) {
        this.a = b;
        this.b = lx6Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        lx6 lx6Var = this.b;
        switch (b) {
            case 0:
                o40 o40Var = (o40) lx6Var.c;
                String str = hac.a;
                xa3 xa3Var = ((c74) o40Var).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1029, new u03(U, (Object) exc, (byte) 28));
                break;
            default:
                o40 o40Var2 = (o40) lx6Var.c;
                String str2 = hac.a;
                xa3 xa3Var2 = ((c74) o40Var2).a.s;
                tk U2 = xa3Var2.U();
                xa3Var2.V(U2, 1014, new ua3(U2, exc, (byte) 20));
                break;
        }
    }
}
