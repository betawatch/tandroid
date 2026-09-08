package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                org.telegram.ui.Components.x51 x51Var = userInfoActivity.x;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.w1.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.yc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.x51 x51Var2 = userInfoActivity2.x;
                    if (x51Var2 != null) {
                        x51Var2.Y2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
