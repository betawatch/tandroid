package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m90 implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ m90(s90 s90Var, String str, int i7) {
        this.a = i7;
        this.b = s90Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        String str = this.c;
        s90 s90Var = this.b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                s90Var.c();
                if (passkeys != null) {
                    s90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        s90Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) obj;
                String str2 = (String) obj2;
                s90Var.c();
                if (g2Var != null) {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.l2.D(T.getContext(), s90Var.b, g2Var, null, T.getResourceProvider(), null, new l90(s90Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.hd.N0(2131742725, null);
                    }
                    org.telegram.ui.Components.lc.c0(str2);
                    break;
                }
                break;
        }
    }
}
