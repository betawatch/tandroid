package ci;

import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ u10 c;

    public /* synthetic */ j8(TLObject tLObject, u10 u10Var, int i3) {
        this.a = i3;
        this.b = tLObject;
        this.c = u10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                u10 u10Var = this.c;
                if (!z11) {
                    u10Var.a(0L);
                    break;
                } else {
                    u10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    break;
                }
            default:
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    li.b0(h10.t0).I1(tL_messages_stickerSet, true);
                    if (!li.b0(h10.t0).B0(tL_messages_stickerSet.set.id, true)) {
                        li.b0(h10.t0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.c.a(Boolean.valueOf(z10));
                break;
        }
    }
}
