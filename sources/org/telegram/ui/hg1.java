package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ hg1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.l71 l71Var = userInfoActivity.x;
                if (l71Var != null) {
                    l71Var.g3.O(true);
                }
                userInfoActivity.c0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.t.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.wc.b0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.c0(true);
                    org.telegram.ui.Components.l71 l71Var2 = userInfoActivity2.x;
                    if (l71Var2 != null) {
                        l71Var2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
