package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class e5 implements ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ di.r c;

    public e5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, di.r rVar) {
        this.a = i7;
        this.b = wallettransactionArr;
        this.c = rVar;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == qs.a4 || i7 == qs.b4) {
            ArrayList arrayList = n0.x(this.a).B().c;
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
                if (wallettransaction == wallettransaction2 || n0.i0(wallettransaction2, wallettransaction)) {
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
