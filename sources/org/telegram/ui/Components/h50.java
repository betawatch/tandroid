package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h50 implements q70 {
    public final /* synthetic */ i50 a;

    public h50(i50 i50Var) {
        this.a = i50Var;
    }

    @Override // org.telegram.ui.Components.q70
    public final void d() {
        n50 n50Var = this.a.c;
        org.telegram.ui.ActionBar.f2 f2Var = n50Var.L1;
        if (f2Var instanceof org.telegram.ui.ef0) {
            org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) f2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = n50Var.i1;
            org.telegram.ui.j90 j90Var = new org.telegram.ui.j90(1, ef0Var.n);
            j90Var.S = ef0Var.s0;
            j90Var.d0(tL_chatInviteExported);
            ef0Var.presentFragment(j90Var);
        } else {
            org.telegram.ui.j90 j90Var2 = new org.telegram.ui.j90(1, n50Var.X1);
            j90Var2.d0(n50Var.i1);
            j90Var2.S = new g50(this);
            n50Var.L1.presentFragment(j90Var2);
        }
        n50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q70
    public final void e() {
        n50 n50Var = this.a.c;
        org.telegram.ui.ActionBar.f2 f2Var = n50Var.L1;
        if (f2Var instanceof org.telegram.ui.ef0) {
            ((org.telegram.ui.ef0) f2Var).k0(n50Var.i1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = n50Var.i1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.qp.s1(n50Var.a).j1(-n50Var.X1);
            ConnectionsManager.getInstance(n50Var.a).sendRequest(tL_messages_editExportedChatInvite, new f50(this, 0));
        }
        n50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q70
    public final void k() {
        n50 n50Var = this.a.c;
        org.telegram.ui.ActionBar.f2 f2Var = n50Var.L1;
        if (f2Var instanceof org.telegram.ui.ef0) {
            ((org.telegram.ui.ef0) f2Var).h0(n50Var.i1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = n50Var.i1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.qp.s1(n50Var.a).j1(-n50Var.X1);
            ConnectionsManager.getInstance(n50Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new f50(this, 1));
        }
        n50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.q70
    public final /* synthetic */ void f() {
    }
}
