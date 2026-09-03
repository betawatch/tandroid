package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hh0 implements ob0 {
    public final /* synthetic */ rh0 a;

    public hh0(rh0 rh0Var) {
        this.a = rh0Var;
    }

    @Override // org.telegram.ui.ob0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.ob0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            rh0 rh0Var = this.a;
            rh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < rh0Var.f0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) rh0Var.f0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        rh0Var.f0.set(i10, tL_chatInviteExported2);
                        rh0Var.i0(true);
                        return;
                    } else {
                        ih0 f02 = rh0Var.f0();
                        rh0Var.f0.remove(i10);
                        rh0Var.g0.add(0, tL_chatInviteExported2);
                        rh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ob0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new ie0(10, this, tLObject), 200L);
        }
    }
}
