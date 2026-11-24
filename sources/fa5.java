// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fa5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa5 b;

    public /* synthetic */ fa5(qa5 qa5Var, byte b) {
        this.a = b;
        this.b = qa5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qa5 qa5Var = this.b;
        switch (b) {
            case 0:
                qa5Var.finishFragment();
                break;
            case 1:
                qa5Var.j0();
                qa5Var.f0();
                break;
            case 2:
                qa5Var.getClass();
                qa5Var.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                qa5Var.n.postOnAnimation(new fa5(qa5Var, (byte) 1));
                break;
        }
    }
}
