package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ ii0(PasskeysActivity passkeysActivity, int i3) {
        this.a = i3;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.bd.M0(2131747637, null);
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(2);
                r31Var.l = M0;
                r31Var.k = R.raw.passkey;
                arrayList.add(r31Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i10);
                    b40 b40Var = new b40(passkeysActivity, 16);
                    int i11 = ji0.b;
                    org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(ji0.class);
                    K.G = passkey;
                    K.D = b40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().x7.z.b).c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(-1, R.drawable.menu_passkey_add, org.telegram.messenger.bd.M0(2131747658, null));
                    c2.q = true;
                    arrayList.add(c2);
                }
                arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131747643, null), new sg0(passkeysActivity, 3)), true)));
                break;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
