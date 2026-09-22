package ai;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ci.f4 f4Var = b0Var.J;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                b0Var.e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                this.b.c();
                break;
        }
    }
}
