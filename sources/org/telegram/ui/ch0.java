package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
