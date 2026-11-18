package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ l90(r90 r90Var, String str, int i7) {
        this.a = i7;
        this.b = r90Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        String str = this.c;
        r90 r90Var = this.b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                r90Var.c();
                if (passkeys != null) {
                    r90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        r90Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) obj;
                String str2 = (String) obj2;
                r90Var.c();
                if (g2Var != null) {
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.l2.D(T.getContext(), r90Var.b, g2Var, null, T.getResourceProvider(), null, new k90(r90Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.gd.M0(2131742733, null);
                    }
                    org.telegram.ui.Components.lc.c0(str2);
                    break;
                }
                break;
        }
    }
}
