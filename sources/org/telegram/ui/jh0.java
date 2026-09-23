package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jh0 implements rb0 {
    public final /* synthetic */ th0 a;

    public jh0(th0 th0Var) {
        this.a = th0Var;
    }

    @Override // org.telegram.ui.rb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.rb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            th0 th0Var = this.a;
            th0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < th0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) th0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        th0Var.i0.set(i10, tL_chatInviteExported2);
                        th0Var.i0(true);
                        return;
                    } else {
                        kh0 f02 = th0Var.f0();
                        th0Var.i0.remove(i10);
                        th0Var.j0.add(0, tL_chatInviteExported2);
                        th0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.rb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new ia0(23, this, tLObject), 200L);
        }
    }
}
