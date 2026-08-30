package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m60 implements w80 {
    public final /* synthetic */ n60 a;

    public m60(n60 n60Var) {
        this.a = n60Var;
    }

    @Override // org.telegram.ui.Components.w80
    public final void a() {
        s60 s60Var = this.a.c;
        org.telegram.ui.ActionBar.p2 p2Var = s60Var.R;
        if (p2Var instanceof org.telegram.ui.ph0) {
            org.telegram.ui.ph0 ph0Var = (org.telegram.ui.ph0) p2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = s60Var.b;
            org.telegram.ui.nb0 nb0Var = new org.telegram.ui.nb0(1, ph0Var.n);
            nb0Var.Q = ph0Var.p0;
            nb0Var.Y(tL_chatInviteExported);
            ph0Var.presentFragment(nb0Var);
        } else {
            org.telegram.ui.nb0 nb0Var2 = new org.telegram.ui.nb0(1, s60Var.d0);
            nb0Var2.Y(s60Var.b);
            nb0Var2.Q = new l60(this);
            s60Var.R.presentFragment(nb0Var2);
        }
        s60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.w80
    public final void c() {
        int i10;
        int i11;
        s60 s60Var = this.a.c;
        org.telegram.ui.ActionBar.p2 p2Var = s60Var.R;
        if (p2Var instanceof org.telegram.ui.ph0) {
            ((org.telegram.ui.ph0) p2Var).e0(s60Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = s60Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-s60Var.d0);
            i11 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new k60(this, 0));
        }
        s60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.w80
    public final void j() {
        int i10;
        int i11;
        s60 s60Var = this.a.c;
        org.telegram.ui.ActionBar.p2 p2Var = s60Var.R;
        if (p2Var instanceof org.telegram.ui.ph0) {
            ((org.telegram.ui.ph0) p2Var).b0(s60Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = s60Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-s60Var.d0);
            i11 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new k60(this, 1));
        }
        s60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void e() {
    }
}
