package ai;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h6 {
    public final ag.c a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final ag.a c;

    public h6(ag.c cVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = cVar;
        this.b = tL_payments_paymentFormStarGift;
        fa[][] faVarArr = fa.S;
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
        ag.c cVar2 = ag.c.a;
        if (cVar == cVar2) {
            this.c = ag.a.g(j10, cVar2);
            return;
        }
        ag.c cVar3 = ag.c.b;
        if (cVar == cVar3) {
            this.c = ag.a.i(j10, cVar3);
        } else {
            this.c = ag.a.i(0L, cVar2);
        }
    }
}
