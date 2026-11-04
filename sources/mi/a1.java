package mi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ a1(h1 h1Var, int i3) {
        this.a = i3;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                j4 j4Var = h1Var.G2;
                if (j4Var != null && h1Var.a2 != null) {
                    h1Var.H2 = true;
                    j4Var.b().a.m(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((s2) h1Var.a2).a(h1Var, h1Var.G2, true);
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
