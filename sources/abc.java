// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class abc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ abc(UserInfoActivity userInfoActivity, byte b) {
        this.a = b;
        this.b = userInfoActivity;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (b) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                wa waVar = userInfoActivity.y;
                if (waVar != null) {
                    waVar.g3.O(true);
                }
                userInfoActivity.e0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        bs2.v(null, 2131751198, d31.b0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.e0(true);
                    wa waVar2 = userInfoActivity.y;
                    if (waVar2 != null) {
                        waVar2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
