package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ez0 implements hq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ kq b;
    public final /* synthetic */ ProfileActivity c;

    public ez0(ProfileActivity profileActivity, TLRPC.Chat chat, kq kqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = kqVar;
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        kq kqVar = this.b;
        if (!kqVar.Q || kqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.m2 m2Var : kqVar.getParentLayout().getFragmentStack()) {
            if (m2Var instanceof ub) {
                ub ubVar = (ub) m2Var;
                ubVar.V0();
                AndroidUtilities.runOnUIThread(new jf0(ubVar, user, chat, 25));
                return;
            }
        }
    }
}
