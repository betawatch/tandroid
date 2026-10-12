package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ bc0(jc0 jc0Var, String str, int i10) {
        this.a = i10;
        this.b = jc0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                jc0 jc0Var = this.b;
                jc0Var.c();
                if (passkeys != null) {
                    jc0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.c)) {
                        jc0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str = (String) obj2;
                jc0 jc0Var2 = this.b;
                jc0Var2.c();
                if (y1Var != null) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && U.getContext() != null) {
                        org.telegram.ui.Wallet.d2.B(U.getContext(), jc0Var2.b, y1Var, null, U.getResourceProvider(), null, new ec0(jc0Var2, this.c, 1));
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
