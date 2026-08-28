package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ cl0(PasskeysActivity passkeysActivity, int i9) {
        this.a = i9;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i9 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i9) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i10 = R.raw.passkey;
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.l = string;
                l41Var.k = i10;
                arrayList.add(l41Var);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i11);
                    q50 q50Var = new q50(passkeysActivity, 15);
                    int i12 = el0.a;
                    org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(el0.class);
                    J.G = passkey;
                    J.D = q50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.l41.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new zk0(passkeysActivity, 1)), true)));
                break;
            default:
                PasskeysActivity.T(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
