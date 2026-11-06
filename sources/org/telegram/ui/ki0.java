package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki0 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ ki0(PasskeysActivity passkeysActivity, int i7) {
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
                String M0 = org.telegram.messenger.hd.M0(2131747628, null);
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(2);
                r31Var.l = M0;
                r31Var.k = R.raw.passkey;
                arrayList.add(r31Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i10);
                    g40 g40Var = new g40(passkeysActivity, 16);
                    int i11 = mi0.b;
                    org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(mi0.class);
                    K.G = passkey;
                    K.D = g40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().x7.z.b).c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.r31 c10 = org.telegram.ui.Components.r31.c(-1, R.drawable.menu_passkey_add, org.telegram.messenger.hd.M0(2131747649, null));
                    c10.q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131747634, null), new ef0(passkeysActivity, 4)), true)));
                break;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
