package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g50 implements p70 {
    public final /* synthetic */ h50 a;

    public g50(h50 h50Var) {
        this.a = h50Var;
    }

    @Override // org.telegram.ui.Components.p70
    public final void d() {
        m50 m50Var = this.a.c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.O1;
        if (f2Var instanceof org.telegram.ui.ff0) {
            org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) f2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = m50Var.l1;
            org.telegram.ui.k90 k90Var = new org.telegram.ui.k90(1, ff0Var.n);
            k90Var.S = ff0Var.s0;
            k90Var.d0(tL_chatInviteExported);
            ff0Var.presentFragment(k90Var);
        } else {
            org.telegram.ui.k90 k90Var2 = new org.telegram.ui.k90(1, m50Var.a2);
            k90Var2.d0(m50Var.l1);
            k90Var2.S = new f50(this);
            m50Var.O1.presentFragment(k90Var2);
        }
        m50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.p70
    public final void e() {
        m50 m50Var = this.a.c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.O1;
        if (f2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) f2Var).k0(m50Var.l1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = m50Var.l1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.qp.s1(m50Var.a).j1(-m50Var.a2);
            ConnectionsManager.getInstance(m50Var.a).sendRequest(tL_messages_editExportedChatInvite, new e50(this, 0));
        }
        m50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.p70
    public final void k() {
        m50 m50Var = this.a.c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.O1;
        if (f2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) f2Var).h0(m50Var.l1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = m50Var.l1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.qp.s1(m50Var.a).j1(-m50Var.a2);
            ConnectionsManager.getInstance(m50Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new e50(this, 1));
        }
        m50Var.dismiss();
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void f() {
    }
}
