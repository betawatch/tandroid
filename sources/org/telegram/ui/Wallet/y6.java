package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ y6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a7 a7Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a7Var.getParentActivity(), 0, a7Var.getResourceProvider());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
