package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bz0 implements iq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ lq b;
    public final /* synthetic */ ProfileActivity c;

    public bz0(ProfileActivity profileActivity, TLRPC.Chat chat, lq lqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = lqVar;
    }

    @Override // org.telegram.ui.iq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.J.m(-profileActivity.c1, user, profileActivity.B2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.iq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1));
        if (user == null || (chat = this.a) == null || profileActivity.b1 == 0) {
            return;
        }
        lq lqVar = this.b;
        if (!lqVar.N || lqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.p2 p2Var : lqVar.getParentLayout().getFragmentStack()) {
            if (p2Var instanceof ub) {
                ub ubVar = (ub) p2Var;
                ubVar.W0();
                AndroidUtilities.runOnUIThread(new jf0(ubVar, user, chat, 25));
                return;
            }
        }
    }
}
