package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class t5 implements fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ fi.r c;

    public t5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, fi.r rVar) {
        this.a = i7;
        this.b = wallettransactionArr;
        this.c = rVar;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == ks.d4 || i7 == ks.e4) {
            ArrayList arrayList = u0.D(this.a).H().c;
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
                if (wallettransaction == wallettransaction2 || u0.t0(wallettransaction2, wallettransaction)) {
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
