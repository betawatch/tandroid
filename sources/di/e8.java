package di;

import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ y10 c;

    public /* synthetic */ e8(TLObject tLObject, y10 y10Var, int i7) {
        this.a = i7;
        this.b = tLObject;
        this.c = y10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                y10 y10Var = this.c;
                if (!z11) {
                    y10Var.a(0L);
                    break;
                } else {
                    y10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    break;
                }
            default:
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    si.d0(k10.t0).N1(tL_messages_stickerSet, true);
                    if (!si.d0(k10.t0).E0(tL_messages_stickerSet.set.id, true)) {
                        si.d0(k10.t0).k2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.c.a(Boolean.valueOf(z10));
                break;
        }
    }
}
