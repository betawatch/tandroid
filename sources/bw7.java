// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PasskeysActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bw7 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ bw7(PasskeysActivity passkeysActivity, byte b) {
        this.a = b;
        this.b = passkeysActivity;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = k96.M0(2131747436, null);
                c4c c4cVar = new c4c(2);
                c4cVar.m = M0;
                c4cVar.k = R.raw.passkey;
                arrayList.add(c4cVar);
                for (int i = 0; i < arrayList2.size(); i++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i);
                    fr7 fr7Var = new fr7(passkeysActivity, (byte) 5);
                    int i2 = cw7.b;
                    c4c K = c4c.K(cw7.class);
                    K.H = passkey;
                    K.E = fr7Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().k4.D.f()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    c4c c = c4c.c(-1, R.drawable.menu_passkey_add, k96.M0(2131747457, null));
                    c.r = true;
                    arrayList.add(c);
                }
                arrayList.add(c4c.C(gl.E2(gl.O2(k96.M0(2131747442, null), -1, 0, new oq7(passkeysActivity, (byte) 6), null), true)));
                break;
            default:
                passkeysActivity.a0((TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
