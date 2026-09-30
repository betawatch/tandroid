package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class y60 implements h90 {
    public final /* synthetic */ z60 a;

    public y60(z60 z60Var) {
        this.a = z60Var;
    }

    @Override // org.telegram.ui.Components.h90
    public final void c() {
        e70 e70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = e70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            org.telegram.ui.sh0 sh0Var = (org.telegram.ui.sh0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = e70Var.b;
            org.telegram.ui.rb0 rb0Var = new org.telegram.ui.rb0(1, sh0Var.n);
            rb0Var.T = sh0Var.s0;
            rb0Var.Y(tL_chatInviteExported);
            sh0Var.presentFragment(rb0Var);
        } else {
            org.telegram.ui.rb0 rb0Var2 = new org.telegram.ui.rb0(1, e70Var.g0);
            rb0Var2.Y(e70Var.b);
            rb0Var2.T = new x60(this);
            e70Var.U.presentFragment(rb0Var2);
        }
        e70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.h90
    public final void e() {
        int i10;
        int i11;
        e70 e70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = e70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).e0(e70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = e70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.e3) e70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-e70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.e3) e70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new w60(this, 0));
        }
        e70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.h90
    public final void k() {
        int i10;
        int i11;
        e70 e70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = e70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).b0(e70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = e70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.e3) e70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-e70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.e3) e70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new w60(this, 1));
        }
        e70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.h90
    public final /* synthetic */ void j() {
    }
}
