package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ eh1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.n61 n61Var = userInfoActivity.x;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.f0.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.yc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.n61 n61Var2 = userInfoActivity2.x;
                    if (n61Var2 != null) {
                        n61Var2.Y2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
