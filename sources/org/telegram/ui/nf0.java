package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf0 b;

    public /* synthetic */ nf0(qf0 qf0Var, int i10) {
        this.a = i10;
        this.b = qf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b.v;
                ig0Var.z1(0, true, null, true);
                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                ig0 ig0Var2 = this.b.v;
                ig0Var2.z1(0, true, null, true);
                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.o();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ig0 ig0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ig0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
