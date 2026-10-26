package bi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d6 {
    public final bg.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final bg.a c;

    public d6(bg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        ca[][] caVarArr = ca.S;
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
        bg.b bVar2 = bg.b.a;
        if (bVar == bVar2) {
            this.c = bg.a.g(j10, bVar2);
            return;
        }
        bg.b bVar3 = bg.b.b;
        if (bVar == bVar3) {
            this.c = bg.a.i(j10, bVar3);
        } else {
            this.c = bg.a.i(0L, bVar2);
        }
    }
}
