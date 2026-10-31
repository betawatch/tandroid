package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class na0 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ua0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ na0(ua0 ua0Var, String str, int i10) {
        this.a = i10;
        this.b = ua0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        String str = this.c;
        ua0 ua0Var = this.b;
        switch (i10) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ua0Var.c();
                if (passkeys != null) {
                    ua0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        ua0Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str2 = (String) obj2;
                ua0Var.c();
                if (z1Var != null) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.e2.D(T.getContext(), ua0Var.b, z1Var, null, T.getResourceProvider(), null, new qa0(ua0Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.cd.L0(2131743017, null);
                    }
                    org.telegram.ui.Components.cc.b0(str2);
                    break;
                }
                break;
        }
    }
}
