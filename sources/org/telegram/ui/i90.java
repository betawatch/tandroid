package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i90 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p90 b;
    public final /* synthetic */ String c;

    public /* synthetic */ i90(p90 p90Var, String str, int i7) {
        this.a = i7;
        this.b = p90Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        String str = this.c;
        p90 p90Var = this.b;
        switch (i7) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                p90Var.c();
                if (passkeys != null) {
                    p90Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str)) {
                        p90Var.x("addPasskeyRow");
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str2 = (String) obj2;
                p90Var.c();
                if (z1Var != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null && T.getContext() != null) {
                        org.telegram.ui.Wallet.e2.D(T.getContext(), p90Var.b, z1Var, null, T.getResourceProvider(), null, new l90(p90Var, str, 1));
                        break;
                    }
                } else {
                    if (str2 == null) {
                        str2 = org.telegram.messenger.id.M0(2131742994, null);
                    }
                    org.telegram.ui.Components.hc.b0(str2);
                    break;
                }
                break;
        }
    }
}
