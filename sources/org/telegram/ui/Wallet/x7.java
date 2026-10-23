package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ x7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l0.w(r0.currentAccount).y(new r1(3, this.b, (Utilities.Callback) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                i8 i8Var = this.b;
                if (str == null) {
                    qc M = xc.a0(i8Var).M(LocaleController.getString(R.string.WalletBackupEnabled), LocaleController.getString(R.string.WalletBackupEnabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    i8Var.a.Z2.N(true);
                    break;
                } else {
                    xc.a0(i8Var).e0(str, false);
                    break;
                }
            default:
                i8.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
