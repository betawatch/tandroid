package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g5 implements vs {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ q4 c;

    public g5(int i10, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var) {
        this.a = i10;
        this.b = wallettransactionArr;
        this.c = q4Var;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i10 == at.a4 || i10 == at.b4) {
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
