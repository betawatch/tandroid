package li;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ z0(g1 g1Var, int i7) {
        this.a = i7;
        this.b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                i4 i4Var = g1Var.F2;
                if (i4Var != null && g1Var.Z1 != null) {
                    g1Var.G2 = true;
                    i4Var.b().a.m(false);
                    try {
                        g1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((r2) g1Var.Z1).a(g1Var, g1Var.F2, true);
                    break;
                }
                break;
            case 1:
                this.b.J();
                break;
            default:
                this.b.O();
                break;
        }
    }
}
