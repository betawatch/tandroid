package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nf0 b;

    public /* synthetic */ kf0(nf0 nf0Var, int i10) {
        this.a = i10;
        this.b = nf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b.v;
                eg0Var.u1(0, true, null, true);
                eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                eg0 eg0Var2 = this.b.v;
                eg0Var2.u1(0, true, null, true);
                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                eg0 eg0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) eg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                eg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
