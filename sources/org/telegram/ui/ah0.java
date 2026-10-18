package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ah0 implements bb0 {
    public final /* synthetic */ kh0 a;

    public ah0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    @Override // org.telegram.ui.bb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.bb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            kh0 kh0Var = this.a;
            kh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < kh0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) kh0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        kh0Var.i0.set(i10, tL_chatInviteExported2);
                        kh0Var.i0(true);
                        return;
                    } else {
                        bh0 f02 = kh0Var.f0();
                        kh0Var.i0.remove(i10);
                        kh0Var.j0.add(0, tL_chatInviteExported2);
                        kh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.bb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new zg0(0, this, tLObject), 200L);
        }
    }
}
