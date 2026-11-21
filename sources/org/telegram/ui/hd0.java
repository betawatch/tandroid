package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld0 b;

    public /* synthetic */ hd0(ld0 ld0Var, int i7) {
        this.a = i7;
        this.b = ld0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        ld0 ld0Var = this.b;
        switch (i10) {
            case 0:
                ld0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                de0 de0Var = ld0Var.w;
                i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                de0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                de0 de0Var2 = ld0Var.w;
                de0Var2.M1(0, true, null, true);
                de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, null));
                break;
            case 3:
                de0 de0Var3 = ld0Var.w;
                de0Var3.M1(0, true, null, true);
                de0Var3.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, null));
                break;
            default:
                ld0Var.b.setLoading(false);
                break;
        }
    }
}
