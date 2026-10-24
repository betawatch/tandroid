package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hb0(ob0 ob0Var, String str, int i10) {
        this.a = i10;
        this.b = ob0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ob0 ob0Var = this.b;
                ob0Var.c();
                if (passkeys != null) {
                    ob0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.c)) {
                        ob0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                ob0 ob0Var2 = this.b;
                ob0Var2.c();
                if (z1Var != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && U.getContext() != null) {
                        org.telegram.ui.Wallet.e2.B(U.getContext(), ob0Var2.b, z1Var, null, U.getResourceProvider(), null, new kb0(ob0Var2, this.c, 1));
                        break;
                    }
                } else {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.xc.b0(str);
                    break;
                }
                break;
        }
    }
}
