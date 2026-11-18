package di;

import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ d8(TLObject tLObject, x10 x10Var, int i7) {
        this.a = i7;
        this.b = tLObject;
        this.c = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                x10 x10Var = this.c;
                if (!z11) {
                    x10Var.a(0L);
                    break;
                } else {
                    x10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    break;
                }
            default:
                TLObject tLObject2 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    ri.d0(j10.t0).N1(tL_messages_stickerSet, true);
                    if (!ri.d0(j10.t0).E0(tL_messages_stickerSet.set.id, true)) {
                        ri.d0(j10.t0).k2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.c.a(Boolean.valueOf(z10));
                break;
        }
    }
}
