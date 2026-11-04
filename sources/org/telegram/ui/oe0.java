package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oe0 implements d90 {
    public final /* synthetic */ xe0 a;

    public oe0(xe0 xe0Var) {
        this.a = xe0Var;
    }

    @Override // org.telegram.ui.d90
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.k0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.d90
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            xe0 xe0Var = this.a;
            xe0Var.i0(tL_chatInviteExported2);
            for (int i3 = 0; i3 < xe0Var.j0.size(); i3++) {
                if (((TLRPC.TL_chatInviteExported) xe0Var.j0.get(i3)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        xe0Var.j0.set(i3, tL_chatInviteExported2);
                        xe0Var.o0(true);
                        return;
                    } else {
                        pe0 l02 = xe0Var.l0();
                        xe0Var.j0.remove(i3);
                        xe0Var.k0.add(0, tL_chatInviteExported2);
                        xe0Var.n0(l02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.d90
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.i3(new tb0(13, this, tLObject), 200L);
        }
    }
}
