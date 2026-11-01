package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ me0(re0 re0Var, int i10) {
        this.a = i10;
        this.b = re0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        re0 re0Var = this.b;
        switch (i11) {
            case 0:
                re0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                gf0 gf0Var = re0Var.w;
                i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                gf0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                gf0 gf0Var2 = re0Var.w;
                gf0Var2.D1(0, true, null, true);
                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                break;
            case 3:
                gf0 gf0Var3 = re0Var.w;
                gf0Var3.D1(0, true, null, true);
                gf0Var3.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                break;
            default:
                re0Var.b.setLoading(false);
                break;
        }
    }
}
