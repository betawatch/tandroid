package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j90 implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ j90(q90 q90Var, String str, int i7) {
        this.a = i7;
        this.b = q90Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        String str = this.c;
        q90 q90Var = this.b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                q90Var.c();
                if (passkeys != null) {
                    q90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        q90Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str2 = (String) obj2;
                q90Var.c();
                if (y1Var != null) {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.d2.D(T.getContext(), q90Var.b, y1Var, null, T.getResourceProvider(), null, new m90(q90Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.hd.M0(2131742991, null);
                    }
                    org.telegram.ui.Components.cc.b0(str2);
                    break;
                }
                break;
        }
    }
}
