package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mh0 implements ub0 {
    public final /* synthetic */ wh0 a;

    public mh0(wh0 wh0Var) {
        this.a = wh0Var;
    }

    @Override // org.telegram.ui.ub0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.ub0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            wh0 wh0Var = this.a;
            wh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < wh0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) wh0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        wh0Var.i0.set(i10, tL_chatInviteExported2);
                        wh0Var.i0(true);
                        return;
                    } else {
                        nh0 f02 = wh0Var.f0();
                        wh0Var.i0.remove(i10);
                        wh0Var.j0.add(0, tL_chatInviteExported2);
                        wh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ub0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new h90(26, this, tLObject), 200L);
        }
    }
}
