package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ th0 a;

    public /* synthetic */ fh0(th0 th0Var) {
        this.a = th0Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        th0 th0Var = this.a;
        if ((i10 < th0Var.y || i10 >= th0Var.E) && (i10 < th0Var.H || i10 >= th0Var.I)) {
            return false;
        }
        ((qh0) view).x.callOnClick();
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
        th0 th0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = th0Var.getMessagesController().getInputPeer(-th0Var.n);
        long j3 = th0Var.f;
        if (j3 == th0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = th0Var.getMessagesController().getInputUser(th0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = th0Var.getMessagesController().getInputUser(j3);
        }
        th0Var.c0 = true;
        th0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ch0(th0Var, 1));
    }
}
