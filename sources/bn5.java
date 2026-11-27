// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class bn5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dn5 b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ bn5(dn5 dn5Var, Boolean bool, byte b) {
        this.a = b;
        this.b = dn5Var;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Boolean bool = this.c;
        dn5 dn5Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                dn5Var.h.u.remove(dn5Var.a.e);
                hl.c3(new bn5(dn5Var, bool, b2));
                break;
            default:
                boolean booleanValue = bool.booleanValue();
                wm5 wm5Var = dn5Var.a;
                if (!booleanValue) {
                    jn7.f(wm5Var.o).k(jn7.Z1, wm5Var.e, 2);
                    break;
                } else {
                    jn7.f(wm5Var.o).k(jn7.Y1, wm5Var.e, wm5Var.p);
                    break;
                }
        }
    }
}
