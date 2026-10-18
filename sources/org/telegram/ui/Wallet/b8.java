package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ b8(c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c8Var.getParentActivity(), 0, c8Var.getResourceProvider());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WalletEnterSecretPhraseInfo);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
