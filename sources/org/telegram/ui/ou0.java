package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ou0 implements fp {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ ip b;
    public final /* synthetic */ ProfileActivity c;

    public ou0(ProfileActivity profileActivity, TLRPC.Chat chat, ip ipVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = ipVar;
    }

    @Override // org.telegram.ui.fp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.fp
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1));
        if (a22 == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        ip ipVar = this.b;
        if (!ipVar.R || ipVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.d2 d2Var : ipVar.getParentLayout().getFragmentStack()) {
            if (d2Var instanceof kb) {
                kb kbVar = (kb) d2Var;
                kbVar.a1();
                org.telegram.messenger.g0.h3(new hc0(kbVar, a22, chat, 29));
                return;
            }
        }
    }
}
