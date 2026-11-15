package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class e5 implements is {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ fi.r c;

    public e5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, fi.r rVar) {
        this.a = i7;
        this.b = wallettransactionArr;
        this.c = rVar;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == ns.a4 || i7 == ns.b4) {
            ArrayList arrayList = l0.x(this.a).B().c;
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
                if (wallettransaction == wallettransaction2 || l0.i0(wallettransaction2, wallettransaction)) {
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
