package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                ce0 ce0Var = ld0Var.w;
                i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ce0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                ce0 ce0Var2 = ld0Var.w;
                ce0Var2.M1(0, true, null, true);
                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, null));
                break;
            case 3:
                ce0 ce0Var3 = ld0Var.w;
                ce0Var3.M1(0, true, null, true);
                ce0Var3.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, null));
                break;
            default:
                ld0Var.b.setLoading(false);
                break;
        }
    }
}
