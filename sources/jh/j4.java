package jh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j4 {
    public final kf.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final kf.a c;

    public j4(kf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        s7[][] s7VarArr = s7.S;
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
        kf.b bVar2 = kf.b.a;
        if (bVar == bVar2) {
            this.c = kf.a.g(j10, bVar2);
            return;
        }
        kf.b bVar3 = kf.b.b;
        if (bVar == bVar3) {
            this.c = kf.a.i(j10, bVar3);
        } else {
            this.c = kf.a.i(0L, bVar2);
        }
    }
}
