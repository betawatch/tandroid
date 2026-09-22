package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ai0 a;

    public /* synthetic */ mh0(ai0 ai0Var) {
        this.a = ai0Var;
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        ai0 ai0Var = this.a;
        if ((i10 < ai0Var.y || i10 >= ai0Var.E) && (i10 < ai0Var.H || i10 >= ai0Var.I)) {
            return false;
        }
        ((xh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ai0 ai0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ai0Var.getMessagesController().getInputPeer(-ai0Var.n);
        long j3 = ai0Var.f;
        if (j3 == ai0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ai0Var.getMessagesController().getInputUser(ai0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ai0Var.getMessagesController().getInputUser(j3);
        }
        ai0Var.c0 = true;
        ai0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new jh0(ai0Var, 1));
    }
}
