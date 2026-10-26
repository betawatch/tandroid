package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of0 b;

    public /* synthetic */ lf0(of0 of0Var, int i10) {
        this.a = i10;
        this.b = of0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                gg0 gg0Var = this.b.v;
                gg0Var.z1(0, true, null, true);
                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                gg0 gg0Var2 = this.b.v;
                gg0Var2.z1(0, true, null, true);
                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.o();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                gg0 gg0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.r2) gg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                gg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
