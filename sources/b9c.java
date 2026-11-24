// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b9c implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ b9c(UserInfoActivity userInfoActivity, byte b) {
        this.a = b;
        this.b = userInfoActivity;
    }

    @Override // qac
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
                userInfoActivity.f0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        ts2.u(null, 2131751170, c41.b0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.f0(true);
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
