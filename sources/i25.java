// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ icc d;
    public final /* synthetic */ z45 e;

    public /* synthetic */ i25(c cVar, boolean[] zArr, icc iccVar, z45 z45Var, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = zArr;
        this.d = iccVar;
        this.e = z45Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z45 z45Var = this.e;
        final icc iccVar = this.d;
        final boolean[] zArr = this.c;
        c cVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = cVar.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(z45Var, new icc() { // from class: l25
                            @Override // icc
                            public final void a(Object obj, Object obj2) {
                                byte b3 = b2;
                                icc iccVar2 = iccVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b3) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        iccVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            default:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine22 = cVar.b;
                    if (walletEngine22 != null) {
                        final byte b3 = 1;
                        walletEngine22.previewTonConnect(z45Var, new icc() { // from class: l25
                            @Override // icc
                            public final void a(Object obj, Object obj2) {
                                byte b32 = b3;
                                icc iccVar2 = iccVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b32) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        iccVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
        }
    }
}
