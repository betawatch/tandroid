package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class gz0 implements jq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ mq b;
    public final /* synthetic */ ProfileActivity c;

    public gz0(ProfileActivity profileActivity, TLRPC.Chat chat, mq mqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = mqVar;
    }

    @Override // org.telegram.ui.jq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.jq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        mq mqVar = this.b;
        if (!mqVar.Q || mqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : mqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof wb) {
                wb wbVar = (wb) n2Var;
                wbVar.V0();
                AndroidUtilities.runOnUIThread(new nf0(wbVar, user, chat, 25));
                return;
            }
        }
    }
}
