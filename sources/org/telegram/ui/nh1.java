package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ nh1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.z51 z51Var = userInfoActivity.y;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.L != chat) {
                    userInfoActivity2.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.w1.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.vc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.z51 z51Var2 = userInfoActivity2.y;
                    if (z51Var2 != null) {
                        z51Var2.Y2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
