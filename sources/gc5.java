// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc5 b;

    public /* synthetic */ gc5(rc5 rc5Var, byte b) {
        this.a = b;
        this.b = rc5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rc5 rc5Var = this.b;
        switch (b) {
            case 0:
                rc5Var.finishFragment();
                break;
            case 1:
                rc5Var.j0();
                rc5Var.f0();
                break;
            case 2:
                rc5Var.getClass();
                rc5Var.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                rc5Var.n.postOnAnimation(new gc5(rc5Var, (byte) 1));
                break;
        }
    }
}
