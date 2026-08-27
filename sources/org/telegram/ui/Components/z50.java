package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z50 implements h80 {
    public final /* synthetic */ a60 a;

    public z50(a60 a60Var) {
        this.a = a60Var;
    }

    @Override // org.telegram.ui.Components.h80
    public final void b() {
        f60 f60Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = f60Var.Q;
        if (n2Var instanceof org.telegram.ui.kh0) {
            org.telegram.ui.kh0 kh0Var = (org.telegram.ui.kh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = f60Var.b;
            org.telegram.ui.fb0 fb0Var = new org.telegram.ui.fb0(1, kh0Var.n);
            fb0Var.P = kh0Var.o0;
            fb0Var.Y(tL_chatInviteExported);
            kh0Var.presentFragment(fb0Var);
        } else {
            org.telegram.ui.fb0 fb0Var2 = new org.telegram.ui.fb0(1, f60Var.c0);
            fb0Var2.Y(f60Var.b);
            fb0Var2.P = new y50(this);
            f60Var.Q.presentFragment(fb0Var2);
        }
        f60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.h80
    public final void c() {
        int i10;
        int i11;
        f60 f60Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = f60Var.Q;
        if (n2Var instanceof org.telegram.ui.kh0) {
            ((org.telegram.ui.kh0) n2Var).e0(f60Var.b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = f60Var.b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-f60Var.c0);
            i11 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new x50(this, 0));
        }
        f60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.h80
    public final void k() {
        int i10;
        int i11;
        f60 f60Var = this.a.c;
        org.telegram.ui.ActionBar.n2 n2Var = f60Var.Q;
        if (n2Var instanceof org.telegram.ui.kh0) {
            ((org.telegram.ui.kh0) n2Var).b0(f60Var.b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = f60Var.b.link;
            i10 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-f60Var.c0);
            i11 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new x50(this, 1));
        }
        f60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.h80
    public final /* synthetic */ void g() {
    }
}
