package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pz0 implements mq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ pq b;
    public final /* synthetic */ ProfileActivity c;

    public pz0(ProfileActivity profileActivity, TLRPC.Chat chat, pq pqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = pqVar;
    }

    @Override // org.telegram.ui.mq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.mq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        pq pqVar = this.b;
        if (!pqVar.Q || pqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.o2 o2Var : pqVar.getParentLayout().getFragmentStack()) {
            if (o2Var instanceof wb) {
                wb wbVar = (wb) o2Var;
                wbVar.V0();
                AndroidUtilities.runOnUIThread(new rf0(wbVar, user, chat, 25));
                return;
            }
        }
    }
}
