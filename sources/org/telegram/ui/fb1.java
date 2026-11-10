package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb1 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ fb1(UserInfoActivity userInfoActivity, int i7) {
        this.a = i7;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (i7) {
            case 0:
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                fi.w3 w3Var = userInfoActivity.y;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                }
                userInfoActivity.g0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.K != chat) {
                    userInfoActivity.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.k5.o(null, 2131751233, org.telegram.ui.Components.gc.a0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.g0(true);
                    fi.w3 w3Var2 = userInfoActivity.y;
                    if (w3Var2 != null) {
                        w3Var2.f3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
