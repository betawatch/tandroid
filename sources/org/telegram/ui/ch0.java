package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ch0 implements fb0 {
    public final /* synthetic */ mh0 a;

    public ch0(mh0 mh0Var) {
        this.a = mh0Var;
    }

    @Override // org.telegram.ui.fb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.f0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.fb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            mh0 mh0Var = this.a;
            mh0Var.d0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < mh0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) mh0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        mh0Var.i0.set(i10, tL_chatInviteExported2);
                        mh0Var.j0(true);
                        return;
                    } else {
                        dh0 g02 = mh0Var.g0();
                        mh0Var.i0.remove(i10);
                        mh0Var.j0.add(0, tL_chatInviteExported2);
                        mh0Var.i0(g02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.fb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new bh0(0, this, tLObject), 200L);
        }
    }
}
