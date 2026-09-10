package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u60 implements e90 {
    public final /* synthetic */ v60 a;

    public u60(v60 v60Var) {
        this.a = v60Var;
    }

    @Override // org.telegram.ui.Components.e90
    public final void c() {
        a70 a70Var = this.a.c;
        org.telegram.ui.ActionBar.p2 p2Var = a70Var.U;
        if (p2Var instanceof org.telegram.ui.zh0) {
            org.telegram.ui.zh0 zh0Var = (org.telegram.ui.zh0) p2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.b;
            org.telegram.ui.xb0 xb0Var = new org.telegram.ui.xb0(1, zh0Var.n);
            xb0Var.T = zh0Var.s0;
            xb0Var.Y(tL_chatInviteExported);
            zh0Var.presentFragment(xb0Var);
        } else {
            org.telegram.ui.xb0 xb0Var2 = new org.telegram.ui.xb0(1, a70Var.g0);
            xb0Var2.Y(a70Var.b);
            xb0Var2.T = new t60(this);
            a70Var.U.presentFragment(xb0Var2);
        }
        a70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.e90
    public final void e() {
        int i10;
        int i11;
        a70 a70Var = this.a.c;
        org.telegram.ui.ActionBar.p2 p2Var = a70Var.U;
        if (p2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) p2Var).e0(a70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = a70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-a70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new s60(this, 0));
        }
        a70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.e90
    public final void j() {
        int i10;
        int i11;
        a70 a70Var = this.a.c;
        org.telegram.ui.ActionBar.p2 p2Var = a70Var.U;
        if (p2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) p2Var).b0(a70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = a70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-a70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new s60(this, 1));
        }
        a70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.e90
    public final /* synthetic */ void i() {
    }
}
