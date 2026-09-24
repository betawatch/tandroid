package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class w60 implements f90 {
    public final /* synthetic */ x60 a;

    public w60(x60 x60Var) {
        this.a = x60Var;
    }

    @Override // org.telegram.ui.Components.f90
    public final void c() {
        c70 c70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = c70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            org.telegram.ui.sh0 sh0Var = (org.telegram.ui.sh0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = c70Var.b;
            org.telegram.ui.rb0 rb0Var = new org.telegram.ui.rb0(1, sh0Var.n);
            rb0Var.T = sh0Var.s0;
            rb0Var.Y(tL_chatInviteExported);
            sh0Var.presentFragment(rb0Var);
        } else {
            org.telegram.ui.rb0 rb0Var2 = new org.telegram.ui.rb0(1, c70Var.g0);
            rb0Var2.Y(c70Var.b);
            rb0Var2.T = new v60(this);
            c70Var.U.presentFragment(rb0Var2);
        }
        c70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.f90
    public final void e() {
        int i10;
        int i11;
        c70 c70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = c70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).e0(c70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = c70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-c70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new u60(this, 0));
        }
        c70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.f90
    public final void k() {
        int i10;
        int i11;
        c70 c70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = c70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).b0(c70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = c70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-c70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new u60(this, 1));
        }
        c70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.f90
    public final /* synthetic */ void j() {
    }
}
