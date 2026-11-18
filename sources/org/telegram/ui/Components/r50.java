package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        if (h2Var instanceof org.telegram.ui.gf0) {
            org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) h2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.m1;
            org.telegram.ui.k90 k90Var = new org.telegram.ui.k90(1, gf0Var.n);
            k90Var.T = gf0Var.t0;
            k90Var.d0(tL_chatInviteExported);
            gf0Var.presentFragment(k90Var);
        } else {
            org.telegram.ui.k90 k90Var2 = new org.telegram.ui.k90(1, x50Var.b2);
            k90Var2.d0(x50Var.m1);
            k90Var2.T = new q50(this);
            x50Var.P1.presentFragment(k90Var2);
        }
        x50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.d80
    public final void e() {
        x50 x50Var = this.a.c;
        org.telegram.ui.ActionBar.h2 h2Var = x50Var.P1;
        if (h2Var instanceof org.telegram.ui.gf0) {
            ((org.telegram.ui.gf0) h2Var).k0(x50Var.m1);
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
        if (h2Var instanceof org.telegram.ui.gf0) {
            ((org.telegram.ui.gf0) h2Var).h0(x50Var.m1);
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
