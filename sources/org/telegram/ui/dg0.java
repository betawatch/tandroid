package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ dg0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                yg0 yg0Var = this.b.v;
                yg0Var.u1(0, true, null, true);
                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                yg0 yg0Var2 = this.b.v;
                yg0Var2.u1(0, true, null, true);
                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                yg0 yg0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.o2) yg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                yg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
