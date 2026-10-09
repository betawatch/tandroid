package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ b7(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k0.v(r0.currentAccount).x(new ai.m0(28, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                l7 l7Var = this.b;
                if (str == null) {
                    tc M = ad.a0(l7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    l7Var.a.W2.N(true);
                    break;
                } else {
                    ad.a0(l7Var).e0(str, false);
                    break;
                }
            default:
                l7.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
