package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ ni0(PasskeysActivity passkeysActivity, int i7) {
        this.a = i7;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.id.M0(2131747629, null);
                org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(2);
                x31Var.l = M0;
                x31Var.k = R.raw.passkey;
                arrayList.add(x31Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i10);
                    j40 j40Var = new j40(passkeysActivity, 16);
                    int i11 = pi0.b;
                    org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(pi0.class);
                    K.G = passkey;
                    K.D = j40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().x7.z.b).c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(-1, R.drawable.menu_passkey_add, org.telegram.messenger.id.M0(2131747650, null));
                    c10.q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131747635, null), new hf0(passkeysActivity, 4)), true)));
                break;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
