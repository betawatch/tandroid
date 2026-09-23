package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gz0 implements iq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ lq b;
    public final /* synthetic */ ProfileActivity c;

    public gz0(ProfileActivity profileActivity, TLRPC.Chat chat, lq lqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = lqVar;
    }

    @Override // org.telegram.ui.iq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.iq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        lq lqVar = this.b;
        if (!lqVar.Q || lqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : lqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof ub) {
                ub ubVar = (ub) n2Var;
                ubVar.V0();
                AndroidUtilities.runOnUIThread(new kf0(ubVar, user, chat, 25));
                return;
            }
        }
    }
}
