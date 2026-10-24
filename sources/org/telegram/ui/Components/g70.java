package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g70 implements q90 {
    public final /* synthetic */ h70 a;

    public g70(h70 h70Var) {
        this.a = h70Var;
    }

    @Override // org.telegram.ui.Components.q90
    public final void a() {
        m70 m70Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = m70Var.U;
        if (o2Var instanceof org.telegram.ui.mh0) {
            org.telegram.ui.mh0 mh0Var = (org.telegram.ui.mh0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = m70Var.b;
            org.telegram.ui.gb0 gb0Var = new org.telegram.ui.gb0(1, mh0Var.n);
            gb0Var.T = mh0Var.s0;
            gb0Var.Y(tL_chatInviteExported);
            mh0Var.presentFragment(gb0Var);
        } else {
            org.telegram.ui.gb0 gb0Var2 = new org.telegram.ui.gb0(1, m70Var.g0);
            gb0Var2.Y(m70Var.b);
            gb0Var2.T = new f70(this);
            m70Var.U.presentFragment(gb0Var2);
        }
        m70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q90
    public final void c() {
        int i10;
        int i11;
        m70 m70Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = m70Var.U;
        if (o2Var instanceof org.telegram.ui.mh0) {
            ((org.telegram.ui.mh0) o2Var).f0(m70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = m70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-m70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new e70(this, 0));
        }
        m70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q90
    public final void k() {
        int i10;
        int i11;
        m70 m70Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = m70Var.U;
        if (o2Var instanceof org.telegram.ui.mh0) {
            ((org.telegram.ui.mh0) o2Var).c0(m70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = m70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-m70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new e70(this, 1));
        }
        m70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void j() {
    }
}
