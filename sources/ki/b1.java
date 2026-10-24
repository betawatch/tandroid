package ki;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ b1(h1 h1Var, int i10) {
        this.a = i10;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                k4 k4Var = h1Var.W;
                if (k4Var != null && h1Var.d != null) {
                    h1Var.a0 = true;
                    k4Var.b().setPressed(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((t2) h1Var.d).a(h1Var, h1Var.W, true);
                    break;
                }
                break;
            case 1:
                this.b.n();
                break;
            default:
                this.b.s();
                break;
        }
    }
}
