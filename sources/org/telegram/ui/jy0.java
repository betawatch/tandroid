package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jy0 implements aq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ dq b;
    public final /* synthetic */ ProfileActivity c;

    public jy0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = dqVar;
    }

    @Override // org.telegram.ui.aq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.I.m(-profileActivity.b1, user, profileActivity.A2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.aq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1));
        if (user == null || (chat = this.a) == null || profileActivity.a1 == 0) {
            return;
        }
        dq dqVar = this.b;
        if (!dqVar.M || dqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : dqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof qb) {
                qb qbVar = (qb) n2Var;
                qbVar.W0();
                AndroidUtilities.runOnUIThread(new bf0(qbVar, user, chat, 25));
                return;
            }
        }
    }
}
