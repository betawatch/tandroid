package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ org.telegram.messenger.q20 c;

    public /* synthetic */ nw0(TLObject tLObject, org.telegram.messenger.q20 q20Var, int i10) {
        this.a = i10;
        this.b = tLObject;
        this.c = q20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    z10 = true;
                    org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).I1(tL_messages_stickerSet, true);
                    if (!org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).B0(tL_messages_stickerSet.set.id, true)) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.c.a(Boolean.valueOf(z10));
                break;
            default:
                TLObject tLObject2 = this.b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                org.telegram.messenger.q20 q20Var = this.c;
                if (!z11) {
                    q20Var.a(0L);
                    break;
                } else {
                    q20Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                    break;
                }
        }
    }
}
