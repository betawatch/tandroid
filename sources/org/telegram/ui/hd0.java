package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                de0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                de0 de0Var2 = ld0Var.w;
                de0Var2.M1(0, true, null, true);
                de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                break;
            case 3:
                de0 de0Var3 = ld0Var.w;
                de0Var3.M1(0, true, null, true);
                de0Var3.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                break;
            default:
                ld0Var.b.setLoading(false);
                break;
        }
    }
}
