package gh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m4 {
    public final gf.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final gf.a c;

    public m4(gf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        v7[][] v7VarArr = v7.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i9 = 0;
            j10 = 0;
            while (i9 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i9);
                i9++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        gf.b bVar2 = gf.b.a;
        if (bVar == bVar2) {
            this.c = gf.a.g(j10, bVar2);
            return;
        }
        gf.b bVar3 = gf.b.b;
        if (bVar == bVar3) {
            this.c = gf.a.i(j10, bVar3);
        } else {
            this.c = gf.a.i(0L, bVar2);
        }
    }
}
