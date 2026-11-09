package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;

    public /* synthetic */ jd0(nd0 nd0Var, int i7) {
        this.a = i7;
        this.b = nd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        nd0 nd0Var = this.b;
        switch (i10) {
            case 0:
                nd0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ee0 ee0Var = nd0Var.w;
                i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i7);
                ee0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                ee0 ee0Var2 = nd0Var.w;
                ee0Var2.M1(0, true, null, true);
                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                break;
            case 3:
                ee0 ee0Var3 = nd0Var.w;
                ee0Var3.M1(0, true, null, true);
                ee0Var3.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                break;
            default:
                nd0Var.b.setLoading(false);
                break;
        }
    }
}
