package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke0 implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ xe0 a;

    public /* synthetic */ ke0(xe0 xe0Var) {
        this.a = xe0Var;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        xe0 xe0Var = this.a;
        if ((i3 < xe0Var.E || i3 >= xe0Var.F) && (i3 < xe0Var.I || i3 >= xe0Var.J)) {
            return false;
        }
        ((ue0) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        xe0 xe0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = xe0Var.getMessagesController().j1(-xe0Var.n);
        long j10 = xe0Var.f;
        if (j10 == xe0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = xe0Var.getMessagesController().q1(xe0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = xe0Var.getMessagesController().o1(j10);
        }
        xe0Var.d0 = true;
        xe0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new he0(xe0Var, 1));
    }
}
