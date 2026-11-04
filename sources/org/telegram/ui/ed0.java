package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;

    public /* synthetic */ ed0(id0 id0Var, int i3) {
        this.a = i3;
        this.b = id0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        id0 id0Var = this.b;
        switch (i10) {
            case 0:
                id0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                xd0 xd0Var = id0Var.w;
                i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i3);
                xd0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                xd0 xd0Var2 = id0Var.w;
                xd0Var2.D1(0, true, null, true);
                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                break;
            case 3:
                xd0 xd0Var3 = id0Var.w;
                xd0Var3.D1(0, true, null, true);
                xd0Var3.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                break;
            default:
                id0Var.b.setLoading(false);
                break;
        }
    }
}
