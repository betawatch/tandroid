package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                bi.d6 d6Var = userInfoActivity.y;
                if (d6Var != null) {
                    d6Var.g3.O(true);
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
                    bi.d6 d6Var2 = userInfoActivity.y;
                    if (d6Var2 != null) {
                        d6Var2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
