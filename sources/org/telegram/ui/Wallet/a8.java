package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ a8(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m0.w(r0.currentAccount).y(new s1(3, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                k8 k8Var = this.b;
                if (str == null) {
                    qc M = xc.a0(k8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    k8Var.a.W2.N(true);
                    break;
                } else {
                    xc.a0(k8Var).e0(str, false);
                    break;
                }
            default:
                k8.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
