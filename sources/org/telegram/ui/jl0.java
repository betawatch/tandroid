package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ jl0(PasskeysActivity passkeysActivity, int i10) {
        this.a = i10;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(2);
                h51Var.l = string;
                h51Var.k = i11;
                arrayList.add(h51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i12);
                    f60 f60Var = new f60(passkeysActivity, 15);
                    int i13 = ml0.a;
                    org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(ml0.class);
                    J.G = passkey;
                    J.D = f60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.h51 c3 = org.telegram.ui.Components.h51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c3.q = true;
                    arrayList.add(c3);
                }
                arrayList.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new gl0(passkeysActivity, 1)), true)));
                break;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
