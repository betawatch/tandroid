package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ x7(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m0.w(r0.currentAccount).y(new s1(3, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                h8 h8Var = this.b;
                if (str == null) {
                    qc M = xc.a0(h8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    h8Var.a.W2.N(true);
                    break;
                } else {
                    xc.a0(h8Var).e0(str, false);
                    break;
                }
            default:
                h8.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
