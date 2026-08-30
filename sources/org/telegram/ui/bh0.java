package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ ph0 a;

    public /* synthetic */ bh0(ph0 ph0Var) {
        this.a = ph0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        ph0 ph0Var = this.a;
        if ((i10 < ph0Var.y || i10 >= ph0Var.B) && (i10 < ph0Var.E || i10 >= ph0Var.F)) {
            return false;
        }
        ((mh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ph0 ph0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ph0Var.getMessagesController().getInputPeer(-ph0Var.n);
        long j10 = ph0Var.f;
        if (j10 == ph0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ph0Var.getMessagesController().getInputUser(ph0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ph0Var.getMessagesController().getInputUser(j10);
        }
        ph0Var.Z = true;
        ph0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new yg0(ph0Var, 1));
    }
}
