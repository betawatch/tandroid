package lh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i4 {
    public final lf.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final lf.a c;

    public i4(lf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        t7[][] t7VarArr = t7.S;
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
        lf.b bVar2 = lf.b.a;
        if (bVar == bVar2) {
            this.c = lf.a.g(j10, bVar2);
            return;
        }
        lf.b bVar3 = lf.b.b;
        if (bVar == bVar3) {
            this.c = lf.a.i(j10, bVar3);
        } else {
            this.c = lf.a.i(0L, bVar2);
        }
    }
}
