package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l60 implements u80 {
    public final /* synthetic */ m60 a;

    public l60(m60 m60Var) {
        this.a = m60Var;
    }

    @Override // org.telegram.ui.Components.u80
    public final void a() {
        r60 r60Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = r60Var.U;
        if (o2Var instanceof org.telegram.ui.ai0) {
            org.telegram.ui.ai0 ai0Var = (org.telegram.ui.ai0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = r60Var.b;
            org.telegram.ui.zb0 zb0Var = new org.telegram.ui.zb0(1, ai0Var.n);
            zb0Var.T = ai0Var.s0;
            zb0Var.Y(tL_chatInviteExported);
            ai0Var.presentFragment(zb0Var);
        } else {
            org.telegram.ui.zb0 zb0Var2 = new org.telegram.ui.zb0(1, r60Var.g0);
            zb0Var2.Y(r60Var.b);
            zb0Var2.T = new k60(this);
            r60Var.U.presentFragment(zb0Var2);
        }
        r60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.u80
    public final void c() {
        int i10;
        int i11;
        r60 r60Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = r60Var.U;
        if (o2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) o2Var).e0(r60Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = r60Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.g3) r60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-r60Var.g0);
            i11 = ((org.telegram.ui.ActionBar.g3) r60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new j60(this, 0));
        }
        r60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.u80
    public final void j() {
        int i10;
        int i11;
        r60 r60Var = this.a.c;
        org.telegram.ui.ActionBar.o2 o2Var = r60Var.U;
        if (o2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) o2Var).b0(r60Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = r60Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.g3) r60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-r60Var.g0);
            i11 = ((org.telegram.ui.ActionBar.g3) r60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new j60(this, 1));
        }
        r60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.u80
    public final /* synthetic */ void i() {
    }
}
