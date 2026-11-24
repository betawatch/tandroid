// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class e25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ jac d;
    public final /* synthetic */ v45 e;

    public /* synthetic */ e25(c cVar, boolean[] zArr, jac jacVar, v45 v45Var, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = zArr;
        this.d = jacVar;
        this.e = v45Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v45 v45Var = this.e;
        final jac jacVar = this.d;
        final boolean[] zArr = this.c;
        c cVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = cVar.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(v45Var, new jac() { // from class: h25
                            @Override // jac
                            public final void a(Object obj, Object obj2) {
                                byte b3 = b2;
                                jac jacVar2 = jacVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b3) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        jacVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            default:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine22 = cVar.b;
                    if (walletEngine22 != null) {
                        final byte b3 = 1;
                        walletEngine22.previewTonConnect(v45Var, new jac() { // from class: h25
                            @Override // jac
                            public final void a(Object obj, Object obj2) {
                                byte b32 = b3;
                                jac jacVar2 = jacVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b32) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        jacVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
        }
    }
}
