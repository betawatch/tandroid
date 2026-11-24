// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nnc implements jm7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ zf5 c;

    public nnc(int i, TL_wallet.walletTransaction[] wallettransactionArr, zf5 zf5Var) {
        this.a = i;
        this.b = wallettransactionArr;
        this.c = zf5Var;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i == nm7.e4 || i == nm7.f4) {
            ArrayList arrayList = c.C(this.a).G().c;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                wallettransactionArr = this.b;
                if (i3 >= size) {
                    wallettransaction = null;
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                wallettransaction = (TL_wallet.walletTransaction) obj;
                TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                if (wallettransaction == wallettransaction2 || c.t0(wallettransaction2, wallettransaction)) {
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
