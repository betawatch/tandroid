package hh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k4 {
    public final hf.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final hf.a c;

    public k4(hf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        u7[][] u7VarArr = u7.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i10 = 0;
            j10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        hf.b bVar2 = hf.b.a;
        if (bVar == bVar2) {
            this.c = hf.a.g(j10, bVar2);
            return;
        }
        hf.b bVar3 = hf.b.b;
        if (bVar == bVar3) {
            this.c = hf.a.i(j10, bVar3);
        } else {
            this.c = hf.a.i(0L, bVar2);
        }
    }
}
