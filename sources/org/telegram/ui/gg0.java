package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;

    public /* synthetic */ gg0(kg0 kg0Var, int i10) {
        this.a = i10;
        this.b = kg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                bh0 bh0Var = this.b.v;
                bh0Var.u1(0, true, null, true);
                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                bh0 bh0Var2 = this.b.v;
                bh0Var2.u1(0, true, null, true);
                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                bh0 bh0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) bh0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                bh0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
