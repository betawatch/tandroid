package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ dg1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.F = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.e51 e51Var = userInfoActivity.x;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.G != chat) {
                    userInfoActivity2.G = chat;
                    if (chat != null) {
                        org.telegram.messenger.y1.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.mc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.e51 e51Var2 = userInfoActivity2.x;
                    if (e51Var2 != null) {
                        e51Var2.U2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
