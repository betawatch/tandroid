package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ l90(s90 s90Var, String str, int i7) {
        this.a = i7;
        this.b = s90Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.v10
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
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str2 = (String) obj2;
                s90Var.c();
                if (y1Var != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.d2.D(T.getContext(), s90Var.b, y1Var, null, T.getResourceProvider(), null, new o90(s90Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.id.M0(2131742991, null);
                    }
                    org.telegram.ui.Components.gc.b0(str2);
                    break;
                }
                break;
        }
    }
}
