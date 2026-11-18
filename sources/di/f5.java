package di;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f5 {
    public final cg.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final cg.a c;

    public f5(cg.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        x8[][] x8VarArr = x8.S;
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
            this.c = cg.a.h(j3, bVar2);
            return;
        }
        cg.b bVar3 = cg.b.b;
        if (bVar == bVar3) {
            this.c = cg.a.j(j3, bVar3);
        } else {
            this.c = cg.a.j(0L, bVar2);
        }
    }
}
