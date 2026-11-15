package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd0 b;

    public /* synthetic */ fd0(kd0 kd0Var, int i7) {
        this.a = i7;
        this.b = kd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        kd0 kd0Var = this.b;
        switch (i10) {
            case 0:
                kd0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ce0 ce0Var = kd0Var.w;
                i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ce0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                ce0 ce0Var2 = kd0Var.w;
                ce0Var2.M1(0, true, null, true);
                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                break;
            case 3:
                ce0 ce0Var3 = kd0Var.w;
                ce0Var3.M1(0, true, null, true);
                ce0Var3.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                break;
            default:
                kd0Var.b.setLoading(false);
                break;
        }
    }
}
