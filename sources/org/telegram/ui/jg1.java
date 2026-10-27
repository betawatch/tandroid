package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ jg1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.m71 m71Var = userInfoActivity.x;
                if (m71Var != null) {
                    m71Var.g3.O(true);
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
                    org.telegram.ui.Components.m71 m71Var2 = userInfoActivity2.x;
                    if (m71Var2 != null) {
                        m71Var2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
