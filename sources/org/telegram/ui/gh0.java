package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gh0 implements nb0 {
    public final /* synthetic */ qh0 a;

    public gh0(qh0 qh0Var) {
        this.a = qh0Var;
    }

    @Override // org.telegram.ui.nb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.nb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            qh0 qh0Var = this.a;
            qh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < qh0Var.f0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) qh0Var.f0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        qh0Var.f0.set(i10, tL_chatInviteExported2);
                        qh0Var.i0(true);
                        return;
                    } else {
                        hh0 f02 = qh0Var.f0();
                        qh0Var.f0.remove(i10);
                        qh0Var.g0.add(0, tL_chatInviteExported2);
                        qh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.nb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new ue0(9, this, tLObject), 200L);
        }
    }
}
