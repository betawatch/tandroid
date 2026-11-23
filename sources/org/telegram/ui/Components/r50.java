package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r50 implements c80 {
    public final /* synthetic */ s50 a;

    public r50(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // org.telegram.ui.Components.c80
    public final void d() {
        x50 x50Var = this.a.c;
        org.telegram.ui.ActionBar.g2 g2Var = x50Var.P1;
        if (g2Var instanceof org.telegram.ui.ef0) {
            org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) g2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.m1;
            org.telegram.ui.j90 j90Var = new org.telegram.ui.j90(1, ef0Var.n);
            j90Var.T = ef0Var.t0;
            j90Var.d0(tL_chatInviteExported);
            ef0Var.presentFragment(j90Var);
        } else {
            org.telegram.ui.j90 j90Var2 = new org.telegram.ui.j90(1, x50Var.b2);
            j90Var2.d0(x50Var.m1);
            j90Var2.T = new q50(this);
            x50Var.P1.presentFragment(j90Var2);
        }
        x50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.c80
    public final void e() {
        x50 x50Var = this.a.c;
        org.telegram.ui.ActionBar.g2 g2Var = x50Var.P1;
        if (g2Var instanceof org.telegram.ui.ef0) {
            ((org.telegram.ui.ef0) g2Var).k0(x50Var.m1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = x50Var.m1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.mp.u1(x50Var.a).l1(-x50Var.b2);
            ConnectionsManager.getInstance(x50Var.a).sendRequest(tL_messages_editExportedChatInvite, new p50(this, 0));
        }
        x50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.c80
    public final void j() {
        x50 x50Var = this.a.c;
        org.telegram.ui.ActionBar.g2 g2Var = x50Var.P1;
        if (g2Var instanceof org.telegram.ui.ef0) {
            ((org.telegram.ui.ef0) g2Var).h0(x50Var.m1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = x50Var.m1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.mp.u1(x50Var.a).l1(-x50Var.b2);
            ConnectionsManager.getInstance(x50Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new p50(this, 1));
        }
        x50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.c80
    public final /* synthetic */ void g() {
    }
}
