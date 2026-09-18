package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class u60 implements d90 {
    public final /* synthetic */ v60 a;

    public u60(v60 v60Var) {
        this.a = v60Var;
    }

    @Override // org.telegram.ui.Components.d90
    public final void c() {
        a70 a70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = a70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            org.telegram.ui.zh0 zh0Var = (org.telegram.ui.zh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.b;
            org.telegram.ui.yb0 yb0Var = new org.telegram.ui.yb0(1, zh0Var.n);
            yb0Var.T = zh0Var.s0;
            yb0Var.Y(tL_chatInviteExported);
            zh0Var.presentFragment(yb0Var);
        } else {
            org.telegram.ui.yb0 yb0Var2 = new org.telegram.ui.yb0(1, a70Var.g0);
            yb0Var2.Y(a70Var.b);
            yb0Var2.T = new t60(this);
            a70Var.U.presentFragment(yb0Var2);
        }
        a70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d90
    public final void e() {
        int i10;
        int i11;
        a70 a70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = a70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).e0(a70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = a70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) a70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-a70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) a70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new s60(this, 0));
        }
        a70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d90
    public final void k() {
        int i10;
        int i11;
        a70 a70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = a70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).b0(a70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = a70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) a70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-a70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) a70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new s60(this, 1));
        }
        a70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d90
    public final /* synthetic */ void j() {
    }
}
