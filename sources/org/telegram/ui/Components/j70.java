package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class j70 implements v90 {
    public final /* synthetic */ k70 a;

    public j70(k70 k70Var) {
        this.a = k70Var;
    }

    @Override // org.telegram.ui.Components.v90
    public final void c() {
        p70 p70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = p70Var.U;
        if (m2Var instanceof org.telegram.ui.di0) {
            org.telegram.ui.di0 di0Var = (org.telegram.ui.di0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = p70Var.b;
            org.telegram.ui.zb0 zb0Var = new org.telegram.ui.zb0(1, di0Var.n);
            zb0Var.T = di0Var.s0;
            zb0Var.Y(tL_chatInviteExported);
            di0Var.presentFragment(zb0Var);
        } else {
            org.telegram.ui.zb0 zb0Var2 = new org.telegram.ui.zb0(1, p70Var.g0);
            zb0Var2.Y(p70Var.b);
            zb0Var2.T = new i70(this);
            p70Var.U.presentFragment(zb0Var2);
        }
        p70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.v90
    public final void d() {
        int i10;
        int i11;
        p70 p70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = p70Var.U;
        if (m2Var instanceof org.telegram.ui.di0) {
            ((org.telegram.ui.di0) m2Var).e0(p70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = p70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.e3) p70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-p70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.e3) p70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new h70(this, 0));
        }
        p70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.v90
    public final void j() {
        int i10;
        int i11;
        p70 p70Var = this.a.c;
        org.telegram.ui.ActionBar.m2 m2Var = p70Var.U;
        if (m2Var instanceof org.telegram.ui.di0) {
            ((org.telegram.ui.di0) m2Var).b0(p70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = p70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.e3) p70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-p70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.e3) p70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new h70(this, 1));
        }
        p70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.v90
    public final /* synthetic */ void i() {
    }
}
