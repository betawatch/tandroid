// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class k30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg2 b;
    public final /* synthetic */ w83 c;

    public /* synthetic */ k30(tg2 tg2Var, w83 w83Var, byte b) {
        this.a = b;
        this.b = tg2Var;
        this.c = w83Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg2 tg2Var = this.b;
                w83 w83Var = this.c;
                synchronized (w83Var) {
                }
                o30 o30Var = (o30) tg2Var.c;
                String str = g8c.a;
                l93 l93Var = ((t54) o30Var).a.s;
                tj R = l93Var.R((rx6) l93Var.d.e);
                l93Var.V(R, 1013, new i93(R, w83Var, (byte) 7));
                break;
            default:
                tg2 tg2Var2 = this.b;
                w83 w83Var2 = this.c;
                o30 o30Var2 = (o30) tg2Var2.c;
                String str2 = g8c.a;
                l93 l93Var2 = ((t54) o30Var2).a.s;
                tj U = l93Var2.U();
                l93Var2.V(U, 1007, new i93(U, w83Var2, (byte) 2));
                break;
        }
    }
}
