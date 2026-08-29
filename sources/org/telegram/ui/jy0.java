package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        for (org.telegram.ui.ActionBar.o2 o2Var : dqVar.getParentLayout().getFragmentStack()) {
            if (o2Var instanceof ob) {
                ob obVar = (ob) o2Var;
                obVar.W0();
                AndroidUtilities.runOnUIThread(new xe0(obVar, user, chat, 25));
                return;
            }
        }
    }
}
