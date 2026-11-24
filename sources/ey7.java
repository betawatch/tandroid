// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PasskeysActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ey7 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ ey7(PasskeysActivity passkeysActivity, byte b) {
        this.a = b;
        this.b = passkeysActivity;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = jb6.M0(2131747362, null);
                c6c c6cVar = new c6c(2);
                c6cVar.m = M0;
                c6cVar.k = R.raw.passkey;
                arrayList.add(c6cVar);
                for (int i = 0; i < arrayList2.size(); i++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i);
                    m67 m67Var = new m67(passkeysActivity, (byte) 8);
                    int i2 = fy7.b;
                    c6c K = c6c.K(fy7.class);
                    K.H = passkey;
                    K.E = m67Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().l4.D.f()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    c6c c = c6c.c(-1, R.drawable.menu_passkey_add, jb6.M0(2131747383, null));
                    c.r = true;
                    arrayList.add(c);
                }
                arrayList.add(c6c.C(gm.D2(gm.N2(jb6.M0(2131747368, null), -1, 0, new kl7(passkeysActivity, (byte) 13), null), true)));
                break;
            default:
                passkeysActivity.b0((TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
