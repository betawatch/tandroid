// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class an5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dn5 b;

    public /* synthetic */ an5(dn5 dn5Var, byte b) {
        this.a = b;
        this.b = dn5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dn5 dn5Var = this.b;
        switch (b) {
            case 0:
                in5 in5Var = dn5Var.h;
                ThreadLocal threadLocal = in5.I;
                in5Var.Q(true);
                break;
            case 1:
                dn5Var.h.u.remove(dn5Var.a.e);
                hl.c3(new an5(dn5Var, (byte) 3));
                break;
            case 2:
                in5 in5Var2 = dn5Var.h;
                ThreadLocal threadLocal2 = in5.I;
                in5Var2.Q(true);
                break;
            default:
                wm5 wm5Var = dn5Var.a;
                jn7.f(wm5Var.o).k(jn7.Z1, wm5Var.e, 1);
                break;
        }
    }
}
