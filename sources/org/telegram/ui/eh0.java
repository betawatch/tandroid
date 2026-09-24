package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh0 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ sh0 a;

    public /* synthetic */ eh0(sh0 sh0Var) {
        this.a = sh0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        sh0 sh0Var = this.a;
        if ((i10 < sh0Var.y || i10 >= sh0Var.E) && (i10 < sh0Var.H || i10 >= sh0Var.I)) {
            return false;
        }
        ((ph0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        sh0 sh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = sh0Var.getMessagesController().getInputPeer(-sh0Var.n);
        long j3 = sh0Var.f;
        if (j3 == sh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = sh0Var.getMessagesController().getInputUser(sh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = sh0Var.getMessagesController().getInputUser(j3);
        }
        sh0Var.c0 = true;
        sh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new bh0(sh0Var, 1));
    }
}
