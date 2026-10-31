package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ag0 implements la0 {
    public final /* synthetic */ kg0 a;

    public ag0(kg0 kg0Var) {
        this.a = kg0Var;
    }

    @Override // org.telegram.ui.la0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.j0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.la0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            kg0 kg0Var = this.a;
            kg0Var.h0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < kg0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) kg0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        kg0Var.i0.set(i10, tL_chatInviteExported2);
                        kg0Var.n0(true);
                        return;
                    } else {
                        bg0 k02 = kg0Var.k0();
                        kg0Var.i0.remove(i10);
                        kg0Var.j0.add(0, tL_chatInviteExported2);
                        kg0Var.m0(k02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.la0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.i0.h3(new uf0(1, this, tLObject), 200L);
        }
    }
}
