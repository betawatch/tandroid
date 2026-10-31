package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g5 implements us {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ q4 c;

    public g5(int i10, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var) {
        this.a = i10;
        this.b = wallettransactionArr;
        this.c = q4Var;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i10 == zs.a4 || i10 == zs.b4) {
            ArrayList arrayList = k0.x(this.a).B().c;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                wallettransactionArr = this.b;
                if (i12 >= size) {
                    wallettransaction = null;
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                wallettransaction = (TL_wallet.walletTransaction) obj;
                TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                if (wallettransaction == wallettransaction2 || k0.i0(wallettransaction2, wallettransaction)) {
                    break;
                }
            }
            if (wallettransaction != null) {
                wallettransactionArr[0] = wallettransaction;
                this.c.a(wallettransaction);
            }
        }
    }
}
