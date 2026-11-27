// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
