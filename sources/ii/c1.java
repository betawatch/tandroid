package ii;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ c1(i1 i1Var, int i10) {
        this.a = i10;
        this.b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i1 i1Var = this.b;
                l4 l4Var = i1Var.R;
                if (l4Var != null && i1Var.d != null) {
                    i1Var.S = true;
                    l4Var.b().setPressed(false);
                    try {
                        i1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((u2) i1Var.d).a(i1Var, i1Var.R, true);
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
