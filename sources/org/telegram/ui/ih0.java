package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ih0 implements qb0 {
    public final /* synthetic */ sh0 a;

    public ih0(sh0 sh0Var) {
        this.a = sh0Var;
    }

    @Override // org.telegram.ui.qb0
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.e0(tL_chatInviteExported);
    }

    @Override // org.telegram.ui.qb0
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            sh0 sh0Var = this.a;
            sh0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < sh0Var.i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) sh0Var.i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        sh0Var.i0.set(i10, tL_chatInviteExported2);
                        sh0Var.i0(true);
                        return;
                    } else {
                        jh0 f02 = sh0Var.f0();
                        sh0Var.i0.remove(i10);
                        sh0Var.j0.add(0, tL_chatInviteExported2);
                        sh0Var.h0(f02);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.qb0
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new n80(28, this, tLObject), 200L);
        }
    }
}
