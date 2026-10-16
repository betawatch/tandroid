package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ac0(ic0 ic0Var, String str, int i10) {
        this.a = i10;
        this.b = ic0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ic0 ic0Var = this.b;
                ic0Var.c();
                if (passkeys != null) {
                    ic0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.c)) {
                        ic0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                ic0 ic0Var2 = this.b;
                ic0Var2.c();
                if (z1Var != null) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && U.getContext() != null) {
                        org.telegram.ui.Wallet.e2.B(U.getContext(), ic0Var2.b, z1Var, null, U.getResourceProvider(), null, new dc0(ic0Var2, this.c, 1));
                        break;
                    }
                } else {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.zc.b0(str);
                    break;
                }
                break;
        }
    }
}
