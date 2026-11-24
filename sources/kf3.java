// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vf3 b;

    public /* synthetic */ kf3(vf3 vf3Var, byte b) {
        this.a = b;
        this.b = vf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vf3 vf3Var = this.b;
        switch (b) {
            case 0:
                vf3Var.q(true, false);
                break;
            case 1:
                je5 je5Var = vf3Var.K;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                vf3Var.f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                vf3Var.c();
                break;
        }
    }
}
