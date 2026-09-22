package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh0 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ yh0 a;

    public /* synthetic */ kh0(yh0 yh0Var) {
        this.a = yh0Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        yh0 yh0Var = this.a;
        if ((i10 < yh0Var.y || i10 >= yh0Var.E) && (i10 < yh0Var.H || i10 >= yh0Var.I)) {
            return false;
        }
        ((vh0) view).x.callOnClick();
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
        yh0 yh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = yh0Var.getMessagesController().getInputPeer(-yh0Var.n);
        long j3 = yh0Var.f;
        if (j3 == yh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh0Var.getMessagesController().getInputUser(yh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh0Var.getMessagesController().getInputUser(j3);
        }
        yh0Var.c0 = true;
        yh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new hh0(yh0Var, 1));
    }
}
