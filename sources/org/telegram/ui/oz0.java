package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class oz0 implements nq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ qq b;
    public final /* synthetic */ ProfileActivity c;

    public oz0(ProfileActivity profileActivity, TLRPC.Chat chat, qq qqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = qqVar;
    }

    @Override // org.telegram.ui.nq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.nq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        qq qqVar = this.b;
        if (!qqVar.Q || qqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : qqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof ub) {
                ub ubVar = (ub) n2Var;
                ubVar.W0();
                AndroidUtilities.runOnUIThread(new pf0(ubVar, user, chat, 25));
                return;
            }
        }
    }
}
