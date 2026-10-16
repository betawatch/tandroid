package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg0 b;

    public /* synthetic */ fg0(jg0 jg0Var, int i10) {
        this.a = i10;
        this.b = jg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ah0 ah0Var = this.b.v;
                ah0Var.u1(0, true, null, true);
                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                ah0 ah0Var2 = this.b.v;
                ah0Var2.u1(0, true, null, true);
                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ah0 ah0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) ah0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ah0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
