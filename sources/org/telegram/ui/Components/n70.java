package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n70 implements w90 {
    public final /* synthetic */ o70 a;

    public n70(o70 o70Var) {
        this.a = o70Var;
    }

    @Override // org.telegram.ui.Components.w90
    public final void a() {
        t70 t70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            org.telegram.ui.zh0 zh0Var = (org.telegram.ui.zh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = t70Var.b;
            org.telegram.ui.vb0 vb0Var = new org.telegram.ui.vb0(1, zh0Var.n);
            vb0Var.T = zh0Var.s0;
            vb0Var.Y(tL_chatInviteExported);
            zh0Var.presentFragment(vb0Var);
        } else {
            org.telegram.ui.vb0 vb0Var2 = new org.telegram.ui.vb0(1, t70Var.g0);
            vb0Var2.Y(t70Var.b);
            vb0Var2.T = new m70(this);
            t70Var.U.presentFragment(vb0Var2);
        }
        t70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.w90
    public final void c() {
        int i10;
        int i11;
        t70 t70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).e0(t70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = t70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-t70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new l70(this, 0));
        }
        t70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.w90
    public final void j() {
        int i10;
        int i11;
        t70 t70Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).b0(t70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = t70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-t70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new l70(this, 1));
        }
        t70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.w90
    public final /* synthetic */ void i() {
    }
}
