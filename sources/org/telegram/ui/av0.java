package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class av0 implements jp {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ ProfileActivity c;

    public av0(ProfileActivity profileActivity, TLRPC.Chat chat, mp mpVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = mpVar;
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.L.m(-profileActivity.e1, user, profileActivity.D2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1));
        if (a22 == null || (chat = this.a) == null || profileActivity.d1 == 0) {
            return;
        }
        mp mpVar = this.b;
        if (!mpVar.Q || mpVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.f2 f2Var : mpVar.getParentLayout().getFragmentStack()) {
            if (f2Var instanceof mb) {
                mb mbVar = (mb) f2Var;
                mbVar.a1();
                org.telegram.messenger.g0.h3(new oc0(mbVar, a22, chat, 28));
                return;
            }
        }
    }
}
