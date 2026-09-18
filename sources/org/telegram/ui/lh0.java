package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ zh0 a;

    public /* synthetic */ lh0(zh0 zh0Var) {
        this.a = zh0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        zh0 zh0Var = this.a;
        if ((i10 < zh0Var.y || i10 >= zh0Var.E) && (i10 < zh0Var.H || i10 >= zh0Var.I)) {
            return false;
        }
        ((wh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        zh0 zh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = zh0Var.getMessagesController().getInputPeer(-zh0Var.n);
        long j3 = zh0Var.f;
        if (j3 == zh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = zh0Var.getMessagesController().getInputUser(zh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = zh0Var.getMessagesController().getInputUser(j3);
        }
        zh0Var.c0 = true;
        zh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ih0(zh0Var, 1));
    }
}
