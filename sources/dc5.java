// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dc5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc5 b;

    public /* synthetic */ dc5(oc5 oc5Var, byte b) {
        this.a = b;
        this.b = oc5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oc5 oc5Var = this.b;
        switch (b) {
            case 0:
                oc5Var.finishFragment();
                break;
            case 1:
                oc5Var.k0();
                oc5Var.g0();
                break;
            case 2:
                oc5Var.getClass();
                oc5Var.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                oc5Var.n.postOnAnimation(new dc5(oc5Var, (byte) 1));
                break;
        }
    }
}
