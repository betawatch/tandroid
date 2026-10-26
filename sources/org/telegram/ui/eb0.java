package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ eb0(lb0 lb0Var, String str, int i10) {
        this.a = i10;
        this.b = lb0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                lb0 lb0Var = this.b;
                lb0Var.c();
                if (passkeys != null) {
                    lb0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.c)) {
                        lb0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                lb0 lb0Var2 = this.b;
                lb0Var2.c();
                if (z1Var != null) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null && U.getContext() != null) {
                        org.telegram.ui.Wallet.e2.B(U.getContext(), lb0Var2.b, z1Var, null, U.getResourceProvider(), null, new hb0(lb0Var2, this.c, 1));
                        break;
                    }
                } else {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.wc.c0(str);
                    break;
                }
                break;
        }
    }
}
