package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ ah1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                UserInfoActivity userInfoActivity = this.b;
                userInfoActivity.G = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.a61 a61Var = userInfoActivity.x;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.b;
                if (userInfoActivity2.H != chat) {
                    userInfoActivity2.H = chat;
                    if (chat != null) {
                        kf.k0.v(R.string.EditProfileChannelSet, org.telegram.ui.Components.qc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.a61 a61Var2 = userInfoActivity2.x;
                    if (a61Var2 != null) {
                        a61Var2.V2.N(true);
                        break;
                    }
                }
                break;
        }
    }
}
