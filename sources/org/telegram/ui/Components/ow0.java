package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ org.telegram.messenger.r20 c;

    public /* synthetic */ ow0(TLObject tLObject, org.telegram.messenger.r20 r20Var, int i10) {
        this.a = i10;
        this.b = tLObject;
        this.c = r20Var;
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
                    org.telegram.messenger.vi.b0(org.telegram.messenger.e20.s0).I1(tL_messages_stickerSet, true);
                    if (!org.telegram.messenger.vi.b0(org.telegram.messenger.e20.s0).B0(tL_messages_stickerSet.set.id, true)) {
                        org.telegram.messenger.vi.b0(org.telegram.messenger.e20.s0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.c.a(Boolean.valueOf(z10));
                break;
            default:
                TLObject tLObject2 = this.b;
                boolean z11 = tLObject2 instanceof TL_account.paidMessagesRevenue;
                org.telegram.messenger.r20 r20Var = this.c;
                if (!z11) {
                    r20Var.a(0L);
                    break;
                } else {
                    r20Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject2).stars_amount));
                    break;
                }
        }
    }
}
