package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ md0 b;

    public /* synthetic */ id0(md0 md0Var, int i7) {
        this.a = i7;
        this.b = md0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        md0 md0Var = this.b;
        switch (i10) {
            case 0:
                md0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ee0 ee0Var = md0Var.w;
                i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ee0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                ee0 ee0Var2 = md0Var.w;
                ee0Var2.M1(0, true, null, true);
                ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                break;
            case 3:
                ee0 ee0Var3 = md0Var.w;
                ee0Var3.M1(0, true, null, true);
                ee0Var3.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                break;
            default:
                md0Var.b.setLoading(false);
                break;
        }
    }
}
