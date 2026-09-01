package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch0 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ qh0 a;

    public /* synthetic */ ch0(qh0 qh0Var) {
        this.a = qh0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        qh0 qh0Var = this.a;
        if ((i10 < qh0Var.y || i10 >= qh0Var.B) && (i10 < qh0Var.E || i10 >= qh0Var.F)) {
            return false;
        }
        ((nh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        qh0 qh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = qh0Var.getMessagesController().getInputPeer(-qh0Var.n);
        long j10 = qh0Var.f;
        if (j10 == qh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = qh0Var.getMessagesController().getInputUser(qh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = qh0Var.getMessagesController().getInputUser(j10);
        }
        qh0Var.Z = true;
        qh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new zg0(qh0Var, 1));
    }
}
