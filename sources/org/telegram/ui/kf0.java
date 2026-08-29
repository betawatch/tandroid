package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of0 b;

    public /* synthetic */ kf0(of0 of0Var, int i10) {
        this.a = i10;
        this.b = of0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
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
                i10 = ((org.telegram.ui.ActionBar.o2) fg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                fg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
