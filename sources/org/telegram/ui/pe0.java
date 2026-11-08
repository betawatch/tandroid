package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ cf0 a;

    public /* synthetic */ pe0(cf0 cf0Var) {
        this.a = cf0Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        cf0 cf0Var = this.a;
        if ((i7 < cf0Var.D || i7 >= cf0Var.E) && (i7 < cf0Var.H || i7 >= cf0Var.I)) {
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

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        cf0 cf0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = cf0Var.getMessagesController().j1(-cf0Var.n);
        long j3 = cf0Var.f;
        if (j3 == cf0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = cf0Var.getMessagesController().q1(cf0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = cf0Var.getMessagesController().o1(j3);
        }
        cf0Var.c0 = true;
        cf0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new me0(cf0Var, 1));
    }
}
