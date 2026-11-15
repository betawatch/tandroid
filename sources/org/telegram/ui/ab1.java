package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab1 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ ab1(UserInfoActivity userInfoActivity, int i7) {
        this.a = i7;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (i7) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                bi.v3 v3Var = userInfoActivity.y;
                if (v3Var != null) {
                    v3Var.g3.O(true);
                }
                userInfoActivity.g0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.k5.n(null, 2131751233, org.telegram.ui.Components.cc.a0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.g0(true);
                    bi.v3 v3Var2 = userInfoActivity.y;
                    if (v3Var2 != null) {
                        v3Var2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
