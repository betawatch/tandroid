package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iw0 implements fq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ iq b;
    public final /* synthetic */ ProfileActivity c;

    public iw0(ProfileActivity profileActivity, TLRPC.Chat chat, iq iqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = iqVar;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.L.m(-profileActivity.e1, user, profileActivity.D2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1));
        if (Z1 == null || (chat = this.a) == null || profileActivity.d1 == 0) {
            return;
        }
        iq iqVar = this.b;
        if (!iqVar.Q || iqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.k2 k2Var : iqVar.getParentLayout().getFragmentStack()) {
            if (k2Var instanceof sb) {
                sb sbVar = (sb) k2Var;
                sbVar.Z0();
                org.telegram.messenger.i0.g3(new qd0(sbVar, Z1, chat, 28));
                return;
            }
        }
    }
}
