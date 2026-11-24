// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a7c implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ a7c(UserInfoActivity userInfoActivity, byte b) {
        this.a = b;
        this.b = userInfoActivity;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (b) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                va vaVar = userInfoActivity.y;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                }
                userInfoActivity.e0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        ir2.v(null, 2131751221, u21.b0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.e0(true);
                    va vaVar2 = userInfoActivity.y;
                    if (vaVar2 != null) {
                        vaVar2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
