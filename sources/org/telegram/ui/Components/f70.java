package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class f70 implements p90 {
    public final /* synthetic */ g70 a;

    public f70(g70 g70Var) {
        this.a = g70Var;
    }

    @Override // org.telegram.ui.Components.p90
    public final void c() {
        l70 l70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = l70Var.U;
        if (n2Var instanceof org.telegram.ui.jh0) {
            org.telegram.ui.jh0 jh0Var = (org.telegram.ui.jh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = l70Var.b;
            org.telegram.ui.cb0 cb0Var = new org.telegram.ui.cb0(1, jh0Var.n);
            cb0Var.T = jh0Var.s0;
            cb0Var.Y(tL_chatInviteExported);
            jh0Var.presentFragment(cb0Var);
        } else {
            org.telegram.ui.cb0 cb0Var2 = new org.telegram.ui.cb0(1, l70Var.g0);
            cb0Var2.Y(l70Var.b);
            cb0Var2.T = new e70(this);
            l70Var.U.presentFragment(cb0Var2);
        }
        l70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.p90
    public final void d() {
        int i10;
        int i11;
        l70 l70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = l70Var.U;
        if (n2Var instanceof org.telegram.ui.jh0) {
            ((org.telegram.ui.jh0) n2Var).e0(l70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = l70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-l70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new d70(this, 0));
        }
        l70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.p90
    public final void k() {
        int i10;
        int i11;
        l70 l70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = l70Var.U;
        if (n2Var instanceof org.telegram.ui.jh0) {
            ((org.telegram.ui.jh0) n2Var).b0(l70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = l70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-l70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new d70(this, 1));
        }
        l70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void i() {
    }
}
