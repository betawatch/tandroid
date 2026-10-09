package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ph0 implements ub0 {
    public final /* synthetic */ zh0 a;

    public ph0(zh0 zh0Var) {
        this.a = zh0Var;
    }

    @Override // org.telegram.ui.ub0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.ub0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            zh0 zh0Var = this.a;
            zh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < zh0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) zh0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        zh0Var.i0.set(i10, tL_chatInviteExported2);
                        zh0Var.i0(true);
                        return;
                    } else {
                        qh0 f02 = zh0Var.f0();
                        zh0Var.i0.remove(i10);
                        zh0Var.j0.add(0, tL_chatInviteExported2);
                        zh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ub0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new tf0(6, this, tLObject), 200L);
        }
    }
}
