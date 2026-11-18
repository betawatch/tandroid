package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r50 implements d80 {
    public final /* synthetic */ s50 a;

    public r50(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // org.telegram.ui.Components.d80
    public final void d() {
        x50 x50Var = this.a.c;
        org.telegram.ui.ActionBar.h2 h2Var = x50Var.P1;
        if (h2Var instanceof org.telegram.ui.ff0) {
            org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) h2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.m1;
            org.telegram.ui.j90 j90Var = new org.telegram.ui.j90(1, ff0Var.n);
            j90Var.T = ff0Var.t0;
            j90Var.d0(tL_chatInviteExported);
            ff0Var.presentFragment(j90Var);
        } else {
            org.telegram.ui.j90 j90Var2 = new org.telegram.ui.j90(1, x50Var.b2);
            j90Var2.d0(x50Var.m1);
            j90Var2.T = new q50(this);
            x50Var.P1.presentFragment(j90Var2);
        }
        x50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d80
    public final void e() {
        x50 x50Var = this.a.c;
        org.telegram.ui.ActionBar.h2 h2Var = x50Var.P1;
        if (h2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) h2Var).k0(x50Var.m1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = x50Var.m1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.mp.u1(x50Var.a).l1(-x50Var.b2);
            ConnectionsManager.getInstance(x50Var.a).sendRequest(tL_messages_editExportedChatInvite, new p50(this, 0));
        }
        x50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d80
    public final void i() {
        x50 x50Var = this.a.c;
        org.telegram.ui.ActionBar.h2 h2Var = x50Var.P1;
        if (h2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) h2Var).h0(x50Var.m1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = x50Var.m1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.mp.u1(x50Var.a).l1(-x50Var.b2);
            ConnectionsManager.getInstance(x50Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new p50(this, 1));
        }
        x50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void f() {
    }
}
