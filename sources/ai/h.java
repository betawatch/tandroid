package ai;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ h(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(true, false);
                break;
            case 1:
                b0 b0Var = this.b;
                ci.e4 e4Var = b0Var.J;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                b0Var.e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                this.b.c();
                break;
        }
    }
}
