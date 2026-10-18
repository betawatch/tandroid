package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ d8(n8 n8Var, int i10) {
        this.a = i10;
        this.b = n8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m0.w(r0.currentAccount).y(new s1(3, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                n8 n8Var = this.b;
                if (str == null) {
                    qc M = xc.a0(n8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    n8Var.a.W2.N(true);
                    break;
                } else {
                    xc.a0(n8Var).e0(str, false);
                    break;
                }
            default:
                n8.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
