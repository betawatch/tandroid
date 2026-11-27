// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pg3 b;

    public /* synthetic */ eg3(pg3 pg3Var, byte b) {
        this.a = b;
        this.b = pg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pg3 pg3Var = this.b;
        switch (b) {
            case 0:
                pg3Var.p(true, false);
                break;
            case 1:
                kg5 kg5Var = pg3Var.K;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                pg3Var.f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                pg3Var.c();
                break;
        }
    }
}
