package ji;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                k4 k4Var = h1Var.R;
                if (k4Var != null && h1Var.d != null) {
                    h1Var.S = true;
                    k4Var.b().setPressed(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((s2) h1Var.d).a(h1Var, h1Var.R, true);
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
