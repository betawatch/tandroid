package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ k50(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                u50 u50Var = this.b;
                u50Var.n0();
                u50Var.j0();
                break;
            case 2:
                u50 u50Var2 = this.b;
                u50Var2.getClass();
                u50Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                u50 u50Var3 = this.b;
                u50Var3.n.postOnAnimation(new k50(u50Var3, 1));
                break;
        }
    }
}
