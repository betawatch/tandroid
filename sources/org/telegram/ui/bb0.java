package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ bb0(ib0 ib0Var, String str, int i10) {
        this.a = i10;
        this.b = ib0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ib0 ib0Var = this.b;
                ib0Var.c();
                if (passkeys != null) {
                    ib0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.c)) {
                        ib0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str = (String) obj2;
                ib0 ib0Var2 = this.b;
                ib0Var2.c();
                if (a2Var != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && U.getContext() != null) {
                        org.telegram.ui.Wallet.f2.B(U.getContext(), ib0Var2.b, a2Var, null, U.getResourceProvider(), null, new eb0(ib0Var2, this.c, 1));
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
