package ci;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l5 {
    public final dg.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final dg.a c;

    public l5(dg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        e9[][] e9VarArr = e9.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i3 = 0;
            j10 = 0;
            while (i3 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                i3++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        dg.b bVar2 = dg.b.a;
        if (bVar == bVar2) {
            this.c = dg.a.g(j10, bVar2);
            return;
        }
        dg.b bVar3 = dg.b.b;
        if (bVar == bVar3) {
            this.c = dg.a.i(j10, bVar3);
        } else {
            this.c = dg.a.i(0L, bVar2);
        }
    }
}
