package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c5 implements cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ ei.s c;

    public c5(int i3, TL_wallet.walletTransaction[] wallettransactionArr, ei.s sVar) {
        this.a = i3;
        this.b = wallettransactionArr;
        this.c = sVar;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i3 == hs.a4 || i3 == hs.b4) {
            ArrayList arrayList = k0.x(this.a).B().c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                wallettransactionArr = this.b;
                if (i11 >= size) {
                    wallettransaction = null;
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
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
