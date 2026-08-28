package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u50 implements d80 {
    public final /* synthetic */ v50 a;

    public u50(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // org.telegram.ui.Components.d80
    public final void b() {
        a60 a60Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = a60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            org.telegram.ui.hh0 hh0Var = (org.telegram.ui.hh0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.b;
            org.telegram.ui.bb0 bb0Var = new org.telegram.ui.bb0(1, hh0Var.n);
            bb0Var.P = hh0Var.o0;
            bb0Var.X(tL_chatInviteExported);
            hh0Var.presentFragment(bb0Var);
        } else {
            org.telegram.ui.bb0 bb0Var2 = new org.telegram.ui.bb0(1, a60Var.c0);
            bb0Var2.X(a60Var.b);
            bb0Var2.P = new t50(this);
            a60Var.Q.presentFragment(bb0Var2);
        }
        a60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d80
    public final void c() {
        int i9;
        int i10;
        a60 a60Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = a60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) o2Var).d0(a60Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = a60Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i9 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i9).getInputPeer(-a60Var.c0);
            i10 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editExportedChatInvite, new s50(this, 0));
        }
        a60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d80
    public final void k() {
        int i9;
        int i10;
        a60 a60Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = a60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) o2Var).a0(a60Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = a60Var.b.link;
            i9 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i9).getInputPeer(-a60Var.c0);
            i10 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteExportedChatInvite, new s50(this, 1));
        }
        a60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void j() {
    }
}
