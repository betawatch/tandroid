package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class u50 implements f80 {
    public final /* synthetic */ v50 a;

    public u50(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // org.telegram.ui.Components.f80
    public final void d() {
        a60 a60Var = this.a.c;
        org.telegram.ui.ActionBar.g2 g2Var = a60Var.P1;
        if (g2Var instanceof org.telegram.ui.ff0) {
            org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) g2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.m1;
            org.telegram.ui.k90 k90Var = new org.telegram.ui.k90(1, ff0Var.n);
            k90Var.T = ff0Var.t0;
            k90Var.d0(tL_chatInviteExported);
            ff0Var.presentFragment(k90Var);
        } else {
            org.telegram.ui.k90 k90Var2 = new org.telegram.ui.k90(1, a60Var.b2);
            k90Var2.d0(a60Var.m1);
            k90Var2.T = new t50(this);
            a60Var.P1.presentFragment(k90Var2);
        }
        a60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.f80
    public final void e() {
        a60 a60Var = this.a.c;
        org.telegram.ui.ActionBar.g2 g2Var = a60Var.P1;
        if (g2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) g2Var).k0(a60Var.m1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = a60Var.m1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.mp.u1(a60Var.a).l1(-a60Var.b2);
            ConnectionsManager.getInstance(a60Var.a).sendRequest(tL_messages_editExportedChatInvite, new s50(this, 0));
        }
        a60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.f80
    public final void i() {
        a60 a60Var = this.a.c;
        org.telegram.ui.ActionBar.g2 g2Var = a60Var.P1;
        if (g2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) g2Var).h0(a60Var.m1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = a60Var.m1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.mp.u1(a60Var.a).l1(-a60Var.b2);
            ConnectionsManager.getInstance(a60Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new s50(this, 1));
        }
        a60Var.dismiss();
    }

    @Override // org.telegram.ui.Components.f80
    public final /* synthetic */ void f() {
    }
}
