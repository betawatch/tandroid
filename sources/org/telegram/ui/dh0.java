package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh0 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ rh0 a;

    public /* synthetic */ dh0(rh0 rh0Var) {
        this.a = rh0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        rh0 rh0Var = this.a;
        if ((i10 < rh0Var.y || i10 >= rh0Var.B) && (i10 < rh0Var.E || i10 >= rh0Var.F)) {
            return false;
        }
        ((oh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        rh0 rh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = rh0Var.getMessagesController().getInputPeer(-rh0Var.n);
        long j10 = rh0Var.f;
        if (j10 == rh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = rh0Var.getMessagesController().getInputUser(rh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = rh0Var.getMessagesController().getInputUser(j10);
        }
        rh0Var.Z = true;
        rh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ah0(rh0Var, 1));
    }
}
