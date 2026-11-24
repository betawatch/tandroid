// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class olc implements gk7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ be5 c;

    public olc(int i, TL_wallet.walletTransaction[] wallettransactionArr, be5 be5Var) {
        this.a = i;
        this.b = wallettransactionArr;
        this.c = be5Var;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i == kk7.c4 || i == kk7.d4) {
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
