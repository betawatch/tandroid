package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of0 b;

    public /* synthetic */ lf0(of0 of0Var, int i9) {
        this.a = i9;
        this.b = of0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b.v;
                fg0Var.u1(0, true, null, true);
                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                fg0 fg0Var2 = this.b.v;
                fg0Var2.u1(0, true, null, true);
                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                fg0 fg0Var3 = this.b.v;
                i9 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i9);
                fg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
