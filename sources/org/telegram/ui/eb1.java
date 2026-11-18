package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb1 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ eb1(UserInfoActivity userInfoActivity, int i7) {
        this.a = i7;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (i7) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                bi.c6 c6Var = userInfoActivity.y;
                if (c6Var != null) {
                    c6Var.g3.O(true);
                }
                userInfoActivity.g0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.f3.n(null, 2131751222, org.telegram.ui.Components.lc.b0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.g0(true);
                    bi.c6 c6Var2 = userInfoActivity.y;
                    if (c6Var2 != null) {
                        c6Var2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
