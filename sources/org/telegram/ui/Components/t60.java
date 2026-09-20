package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class t60 implements c90 {
    public final /* synthetic */ u60 a;

    public t60(u60 u60Var) {
        this.a = u60Var;
    }

    @Override // org.telegram.ui.Components.c90
    public final void c() {
        z60 z60Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = z60Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            org.telegram.ui.ai0 ai0Var = (org.telegram.ui.ai0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = z60Var.b;
            org.telegram.ui.zb0 zb0Var = new org.telegram.ui.zb0(1, ai0Var.n);
            zb0Var.T = ai0Var.s0;
            zb0Var.Y(tL_chatInviteExported);
            ai0Var.presentFragment(zb0Var);
        } else {
            org.telegram.ui.zb0 zb0Var2 = new org.telegram.ui.zb0(1, z60Var.g0);
            zb0Var2.Y(z60Var.b);
            zb0Var2.T = new s60(this);
            z60Var.U.presentFragment(zb0Var2);
        }
        z60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.c90
    public final void e() {
        int i10;
        int i11;
        z60 z60Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = z60Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) n2Var).e0(z60Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = z60Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) z60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-z60Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) z60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new r60(this, 0));
        }
        z60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.c90
    public final void i() {
        int i10;
        int i11;
        z60 z60Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = z60Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) n2Var).b0(z60Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = z60Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) z60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-z60Var.g0);
            i11 = ((org.telegram.ui.ActionBar.f3) z60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new r60(this, 1));
        }
        z60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.c90
    public final /* synthetic */ void h() {
    }
}
