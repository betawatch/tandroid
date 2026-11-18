package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pi0 implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ pi0(PasskeysActivity passkeysActivity, int i7) {
        this.a = i7;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.gd.M0(2131747436, null);
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.m = M0;
                l41Var.k = R.raw.passkey;
                arrayList.add(l41Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i10);
                    j40 j40Var = new j40(passkeysActivity, 16);
                    int i11 = ri0.b;
                    org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(ri0.class);
                    K.H = passkey;
                    K.E = j40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().A7.E.b).c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(-1, R.drawable.menu_passkey_add, org.telegram.messenger.gd.M0(2131747457, null));
                    c10.r = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131747442, null), new hf0(passkeysActivity, 4)), true)));
                break;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
