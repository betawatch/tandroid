// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg2 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j30(tg2 tg2Var, Exception exc, byte b) {
        this.a = b;
        this.b = tg2Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        tg2 tg2Var = this.b;
        switch (b) {
            case 0:
                o30 o30Var = (o30) tg2Var.c;
                String str = g8c.a;
                l93 l93Var = ((t54) o30Var).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1029, new jz2(U, (Object) exc, (byte) 27));
                break;
            default:
                o30 o30Var2 = (o30) tg2Var.c;
                String str2 = g8c.a;
                l93 l93Var2 = ((t54) o30Var2).a.s;
                tj U2 = l93Var2.U();
                l93Var2.V(U2, 1014, new i93(U2, exc, (byte) 19));
                break;
        }
    }
}
