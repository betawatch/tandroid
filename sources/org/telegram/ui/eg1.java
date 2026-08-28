package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ eg1(UserInfoActivity userInfoActivity, int i9) {
        this.a = i9;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.F = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.c51 c51Var = userInfoActivity.x;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                }
                userInfoActivity.a0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.G != chat) {
                    userInfoActivity2.G = chat;
                    if (chat != null) {
                        org.telegram.messenger.l0.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.oc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.a0(true);
                    org.telegram.ui.Components.c51 c51Var2 = userInfoActivity2.x;
                    if (c51Var2 != null) {
                        c51Var2.U2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
