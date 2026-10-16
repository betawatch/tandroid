package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                k0.v(r0.currentAccount).x(new bi.f0(28, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                l7 l7Var = this.b;
                if (str == null) {
                    sc M = zc.a0(l7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    l7Var.a.W2.N(true);
                    break;
                } else {
                    zc.a0(l7Var).e0(str, false);
                    break;
                }
            default:
                l7.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
