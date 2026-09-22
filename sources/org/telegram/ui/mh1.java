package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ mh1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.y51 y51Var = userInfoActivity.x;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.y0.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.vc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.y51 y51Var2 = userInfoActivity2.x;
                    if (y51Var2 != null) {
                        y51Var2.Y2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
