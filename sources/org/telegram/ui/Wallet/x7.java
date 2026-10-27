package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                l0.x(r0.currentAccount).z(new r1(3, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                h8 h8Var = this.b;
                if (str == null) {
                    qc M = wc.b0(h8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    h8Var.a.g3.O(true);
                    break;
                } else {
                    wc.b0(h8Var).f0(str, false);
                    break;
                }
            default:
                h8.b0(this.b, (Boolean) obj);
                break;
        }
    }
}
