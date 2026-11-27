// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PasskeysActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iz7 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ iz7(PasskeysActivity passkeysActivity, byte b) {
        this.a = b;
        this.b = passkeysActivity;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = ob6.M0(2131747356, null);
                b8c b8cVar = new b8c(2);
                b8cVar.m = M0;
                b8cVar.k = R.raw.passkey;
                arrayList.add(b8cVar);
                for (int i = 0; i < arrayList2.size(); i++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i);
                    am7 am7Var = new am7(passkeysActivity, (byte) 7);
                    int i2 = kz7.b;
                    b8c K = b8c.K(kz7.class);
                    K.H = passkey;
                    K.E = am7Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().k4.F.f()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    b8c c = b8c.c(-1, R.drawable.menu_passkey_add, ob6.M0(2131747377, null));
                    c.r = true;
                    arrayList.add(c);
                }
                arrayList.add(b8c.C(hl.D2(hl.N2(ob6.M0(2131747362, null), -1, 0, new fe7(passkeysActivity, (byte) 21), null), true)));
                break;
            default:
                passkeysActivity.a0((TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
