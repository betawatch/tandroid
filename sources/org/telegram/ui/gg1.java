package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ gg1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.F = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.o51 o51Var = userInfoActivity.x;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.G != chat) {
                    userInfoActivity2.G = chat;
                    if (chat != null) {
                        j7.l1.v(R.string.EditProfileChannelSet, org.telegram.ui.Components.tc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.o51 o51Var2 = userInfoActivity2.x;
                    if (o51Var2 != null) {
                        o51Var2.U2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
