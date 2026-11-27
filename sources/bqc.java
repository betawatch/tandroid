// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class bqc implements fn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ cg5 c;

    public bqc(int i, TL_wallet.walletTransaction[] wallettransactionArr, cg5 cg5Var) {
        this.a = i;
        this.b = wallettransactionArr;
        this.c = cg5Var;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i == jn7.d4 || i == jn7.e4) {
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
                if (wallettransaction == wallettransaction2 || c.w0(wallettransaction2, wallettransaction)) {
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
