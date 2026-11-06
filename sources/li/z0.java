package li;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
