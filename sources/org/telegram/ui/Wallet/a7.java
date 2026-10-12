package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ a7(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j0.v(r0.currentAccount).x(new bi.f0(28, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                k7 k7Var = this.b;
                if (str == null) {
                    sc M = zc.a0(k7Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    k7Var.a.W2.N(true);
                    break;
                } else {
                    zc.a0(k7Var).e0(str, false);
                    break;
                }
            default:
                k7.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
