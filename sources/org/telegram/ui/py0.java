package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class py0 implements yp {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ bq b;
    public final /* synthetic */ ProfileActivity c;

    public py0(ProfileActivity profileActivity, TLRPC.Chat chat, bq bqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = bqVar;
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.g1, user, profileActivity.F2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.yp
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1));
        if (user == null || (chat = this.a) == null || profileActivity.f1 == 0) {
            return;
        }
        bq bqVar = this.b;
        if (!bqVar.Q || bqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : bqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof vb) {
                vb vbVar = (vb) n2Var;
                vbVar.V0();
                AndroidUtilities.runOnUIThread(new ve0(vbVar, user, chat, 26));
                return;
            }
        }
    }
}
