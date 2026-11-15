package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ cf0 a;

    public /* synthetic */ pe0(cf0 cf0Var) {
        this.a = cf0Var;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        cf0 cf0Var = this.a;
        if ((i7 < cf0Var.E || i7 >= cf0Var.F) && (i7 < cf0Var.I || i7 >= cf0Var.J)) {
            return false;
        }
        ((ze0) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        cf0 cf0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = cf0Var.getMessagesController().j1(-cf0Var.n);
        long j3 = cf0Var.f;
        if (j3 == cf0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = cf0Var.getMessagesController().q1(cf0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = cf0Var.getMessagesController().o1(j3);
        }
        cf0Var.d0 = true;
        cf0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new me0(cf0Var, 1));
    }
}
