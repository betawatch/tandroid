package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jy0 implements yp {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ bq b;
    public final /* synthetic */ ProfileActivity c;

    public jy0(ProfileActivity profileActivity, TLRPC.Chat chat, bq bqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = bqVar;
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.I.m(-profileActivity.b1, user, profileActivity.A2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.yp
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1));
        if (user == null || (chat = this.a) == null || profileActivity.a1 == 0) {
            return;
        }
        bq bqVar = this.b;
        if (!bqVar.M || bqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.o2 o2Var : bqVar.getParentLayout().getFragmentStack()) {
            if (o2Var instanceof pb) {
                pb pbVar = (pb) o2Var;
                pbVar.W0();
                AndroidUtilities.runOnUIThread(new ye0(pbVar, user, chat, 25));
                return;
            }
        }
    }
}
