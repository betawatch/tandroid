package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class nz0 implements kq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ nq b;
    public final /* synthetic */ ProfileActivity c;

    public nz0(ProfileActivity profileActivity, TLRPC.Chat chat, nq nqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = nqVar;
    }

    @Override // org.telegram.ui.kq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.kq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        nq nqVar = this.b;
        if (!nqVar.Q || nqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : nqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof vb) {
                vb vbVar = (vb) n2Var;
                vbVar.V0();
                AndroidUtilities.runOnUIThread(new qf0(vbVar, user, chat, 25));
                return;
            }
        }
    }
}
