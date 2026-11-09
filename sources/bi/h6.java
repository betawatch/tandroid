package bi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h6 {
    public final cg.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final cg.a c;

    public h6(cg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        ea[][] eaVarArr = ea.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i7 = 0;
            j3 = 0;
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j3 += tL_labeledPrice.amount;
            }
        } else {
            j3 = 0;
        }
        cg.b bVar2 = cg.b.a;
        if (bVar == bVar2) {
            this.c = cg.a.g(j3, bVar2);
            return;
        }
        cg.b bVar3 = cg.b.b;
        if (bVar == bVar3) {
            this.c = cg.a.i(j3, bVar3);
        } else {
            this.c = cg.a.i(0L, bVar2);
        }
    }
}
