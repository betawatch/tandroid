package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ ni0(PasskeysActivity passkeysActivity, int i7) {
        this.a = i7;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String N0 = org.telegram.messenger.gd.N0(2131747435, null);
                org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(2);
                n41Var.m = N0;
                n41Var.k = R.raw.passkey;
                arrayList.add(n41Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i10);
                    i40 i40Var = new i40(passkeysActivity, 16);
                    int i11 = pi0.b;
                    org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(pi0.class);
                    K.H = passkey;
                    K.E = i40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().A7.E.b).c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(-1, R.drawable.menu_passkey_add, org.telegram.messenger.gd.N0(2131747456, null));
                    c10.r = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131747441, null), new gf0(passkeysActivity, 4)), true)));
                break;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
