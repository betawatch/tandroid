package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h70 implements q90 {
    public final /* synthetic */ i70 a;

    public h70(i70 i70Var) {
        this.a = i70Var;
    }

    @Override // org.telegram.ui.Components.q90
    public final void a() {
        n70 n70Var = this.a.c;
        org.telegram.ui.ActionBar.r2 r2Var = n70Var.U;
        if (r2Var instanceof org.telegram.ui.jh0) {
            org.telegram.ui.jh0 jh0Var = (org.telegram.ui.jh0) r2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = n70Var.b;
            org.telegram.ui.db0 db0Var = new org.telegram.ui.db0(1, jh0Var.n);
            db0Var.S = jh0Var.s0;
            db0Var.Z(tL_chatInviteExported);
            jh0Var.presentFragment(db0Var);
        } else {
            org.telegram.ui.db0 db0Var2 = new org.telegram.ui.db0(1, n70Var.g0);
            db0Var2.Z(n70Var.b);
            db0Var2.S = new g70(this);
            n70Var.U.presentFragment(db0Var2);
        }
        n70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q90
    public final void d() {
        int i10;
        int i11;
        n70 n70Var = this.a.c;
        org.telegram.ui.ActionBar.r2 r2Var = n70Var.U;
        if (r2Var instanceof org.telegram.ui.jh0) {
            ((org.telegram.ui.jh0) r2Var).g0(n70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = n70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.k3) n70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-n70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.k3) n70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new f70(this, 0));
        }
        n70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q90
    public final void k() {
        int i10;
        int i11;
        n70 n70Var = this.a.c;
        org.telegram.ui.ActionBar.r2 r2Var = n70Var.U;
        if (r2Var instanceof org.telegram.ui.jh0) {
            ((org.telegram.ui.jh0) r2Var).d0(n70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = n70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.k3) n70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-n70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.k3) n70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new f70(this, 1));
        }
        n70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void e() {
    }
}
