package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f90 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f90(m90 m90Var, String str, int i3) {
        this.a = i3;
        this.b = m90Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        String str = this.c;
        m90 m90Var = this.b;
        switch (i3) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                m90Var.c();
                if (passkeys != null) {
                    m90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        m90Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.x1 x1Var = (org.telegram.ui.Wallet.x1) obj;
                String str2 = (String) obj2;
                m90Var.c();
                if (x1Var != null) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.c2.D(T.getContext(), m90Var.b, x1Var, null, T.getResourceProvider(), null, new i90(m90Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.bd.M0(2131743001, null);
                    }
                    org.telegram.ui.Components.fc.b0(str2);
                    break;
                }
                break;
        }
    }
}
