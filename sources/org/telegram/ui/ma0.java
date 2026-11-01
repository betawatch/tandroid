package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements org.telegram.messenger.k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ma0(ta0 ta0Var, String str, int i10) {
        this.a = i10;
        this.b = ta0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        String str = this.c;
        ta0 ta0Var = this.b;
        switch (i10) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ta0Var.c();
                if (passkeys != null) {
                    ta0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        ta0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str2 = (String) obj2;
                ta0Var.c();
                if (z1Var != null) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.e2.D(T.getContext(), ta0Var.b, z1Var, null, T.getResourceProvider(), null, new pa0(ta0Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.dd.L0(2131743017, null);
                    }
                    org.telegram.ui.Components.cc.b0(str2);
                    break;
                }
                break;
        }
    }
}
