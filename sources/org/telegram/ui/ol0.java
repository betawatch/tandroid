package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ ol0(PasskeysActivity passkeysActivity, int i10) {
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
                org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(2);
                t61Var.l = string;
                t61Var.k = i11;
                arrayList.add(t61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i12);
                    x50 x50Var = new x50(passkeysActivity, 17);
                    int i13 = pl0.a;
                    org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(pl0.class);
                    K.G = passkey;
                    K.D = x50Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.t61 c10 = org.telegram.ui.Components.t61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.t61.C(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new lj0(passkeysActivity, 3)), true)));
                break;
            default:
                PasskeysActivity.V(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
