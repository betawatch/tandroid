package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ c20 c;

    public /* synthetic */ j9(TLObject tLObject, c20 c20Var, int i7) {
        this.a = i7;
        this.b = tLObject;
        this.c = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                boolean z10 = tLObject instanceof TL_account.paidMessagesRevenue;
                c20 c20Var = this.c;
                if (!z10) {
                    c20Var.a(0L);
                    break;
                } else {
                    c20Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    break;
                }
            default:
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z9 = true;
                    ui.b0(p10.s0).I1(tL_messages_stickerSet, true);
                    if (!ui.b0(p10.s0).B0(tL_messages_stickerSet.set.id, true)) {
                        ui.b0(p10.s0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z9 = false;
                }
                this.c.a(Boolean.valueOf(z9));
                break;
        }
    }
}
