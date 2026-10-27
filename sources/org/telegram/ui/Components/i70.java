package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i70 implements r90 {
    public final /* synthetic */ j70 a;

    public i70(j70 j70Var) {
        this.a = j70Var;
    }

    @Override // org.telegram.ui.Components.r90
    public final void a() {
        o70 o70Var = this.a.c;
        org.telegram.ui.ActionBar.r2 r2Var = o70Var.U;
        if (r2Var instanceof org.telegram.ui.lh0) {
            org.telegram.ui.lh0 lh0Var = (org.telegram.ui.lh0) r2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = o70Var.b;
            org.telegram.ui.fb0 fb0Var = new org.telegram.ui.fb0(1, lh0Var.n);
            fb0Var.S = lh0Var.s0;
            fb0Var.Z(tL_chatInviteExported);
            lh0Var.presentFragment(fb0Var);
        } else {
            org.telegram.ui.fb0 fb0Var2 = new org.telegram.ui.fb0(1, o70Var.g0);
            fb0Var2.Z(o70Var.b);
            fb0Var2.S = new h70(this);
            o70Var.U.presentFragment(fb0Var2);
        }
        o70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.r90
    public final void d() {
        int i10;
        int i11;
        o70 o70Var = this.a.c;
        org.telegram.ui.ActionBar.r2 r2Var = o70Var.U;
        if (r2Var instanceof org.telegram.ui.lh0) {
            ((org.telegram.ui.lh0) r2Var).g0(o70Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = o70Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-o70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new g70(this, 0));
        }
        o70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.r90
    public final void k() {
        int i10;
        int i11;
        o70 o70Var = this.a.c;
        org.telegram.ui.ActionBar.r2 r2Var = o70Var.U;
        if (r2Var instanceof org.telegram.ui.lh0) {
            ((org.telegram.ui.lh0) r2Var).d0(o70Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = o70Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-o70Var.g0);
            i11 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new g70(this, 1));
        }
        o70Var.dismiss();
    }

    @Override // org.telegram.ui.Components.r90
    public final /* synthetic */ void e() {
    }
}
