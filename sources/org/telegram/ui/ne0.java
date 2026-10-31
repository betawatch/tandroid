package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ se0 b;

    public /* synthetic */ ne0(se0 se0Var, int i10) {
        this.a = i10;
        this.b = se0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        se0 se0Var = this.b;
        switch (i11) {
            case 0:
                se0Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                hf0 hf0Var = se0Var.w;
                i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                hf0Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                hf0 hf0Var2 = se0Var.w;
                hf0Var2.C1(0, true, null, true);
                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                break;
            case 3:
                hf0 hf0Var3 = se0Var.w;
                hf0Var3.C1(0, true, null, true);
                hf0Var3.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                break;
            default:
                se0Var.b.setLoading(false);
                break;
        }
    }
}
