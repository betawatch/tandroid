package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w50 implements i80 {
    public final /* synthetic */ x50 a;

    public w50(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // org.telegram.ui.Components.i80
    public final void b() {
        c60 c60Var = this.a.c;
        org.telegram.ui.ActionBar.k2 k2Var = c60Var.L1;
        if (k2Var instanceof org.telegram.ui.ig0) {
            org.telegram.ui.ig0 ig0Var = (org.telegram.ui.ig0) k2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = c60Var.i1;
            org.telegram.ui.la0 la0Var = new org.telegram.ui.la0(1, ig0Var.n);
            la0Var.S = ig0Var.s0;
            la0Var.d0(tL_chatInviteExported);
            ig0Var.presentFragment(la0Var);
        } else {
            org.telegram.ui.la0 la0Var2 = new org.telegram.ui.la0(1, c60Var.X1);
            la0Var2.d0(c60Var.i1);
            la0Var2.S = new v50(this);
            c60Var.L1.presentFragment(la0Var2);
        }
        c60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.i80
    public final void d() {
        c60 c60Var = this.a.c;
        org.telegram.ui.ActionBar.k2 k2Var = c60Var.L1;
        if (k2Var instanceof org.telegram.ui.ig0) {
            ((org.telegram.ui.ig0) k2Var).k0(c60Var.i1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = c60Var.i1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.wp.r1(c60Var.a).i1(-c60Var.X1);
            ConnectionsManager.getInstance(c60Var.a).sendRequest(tL_messages_editExportedChatInvite, new u50(this, 0));
        }
        c60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.i80
    public final void n() {
        c60 c60Var = this.a.c;
        org.telegram.ui.ActionBar.k2 k2Var = c60Var.L1;
        if (k2Var instanceof org.telegram.ui.ig0) {
            ((org.telegram.ui.ig0) k2Var).h0(c60Var.i1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = c60Var.i1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.wp.r1(c60Var.a).i1(-c60Var.X1);
            ConnectionsManager.getInstance(c60Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new u50(this, 1));
        }
        c60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.i80
    public final /* synthetic */ void g() {
    }
}
