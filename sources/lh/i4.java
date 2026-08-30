package lh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i4 {
    public final mf.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final mf.a c;

    public i4(mf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
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
        mf.b bVar2 = mf.b.a;
        if (bVar == bVar2) {
            this.c = mf.a.g(j10, bVar2);
            return;
        }
        mf.b bVar3 = mf.b.b;
        if (bVar == bVar3) {
            this.c = mf.a.i(j10, bVar3);
        } else {
            this.c = mf.a.i(0L, bVar2);
        }
    }
}
