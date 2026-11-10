package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od0 b;

    public /* synthetic */ kd0(od0 od0Var, int i7) {
        this.a = i7;
        this.b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        od0 od0Var = this.b;
        switch (i10) {
            case 0:
                od0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                fe0 fe0Var = od0Var.w;
                i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                fe0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                fe0 fe0Var2 = od0Var.w;
                fe0Var2.M1(0, true, null, true);
                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                break;
            case 3:
                fe0 fe0Var3 = od0Var.w;
                fe0Var3.M1(0, true, null, true);
                fe0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                break;
            default:
                od0Var.b.setLoading(false);
                break;
        }
    }
}
