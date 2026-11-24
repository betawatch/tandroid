// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e05 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ i8c d;
    public final /* synthetic */ v25 e;

    public /* synthetic */ e05(c cVar, boolean[] zArr, i8c i8cVar, v25 v25Var, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = zArr;
        this.d = i8cVar;
        this.e = v25Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v25 v25Var = this.e;
        final i8c i8cVar = this.d;
        final boolean[] zArr = this.c;
        c cVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = cVar.b;
                    if (walletEngine2 != null) {
                        walletEngine2.previewTonConnect(v25Var, new i8c() { // from class: h05
                            @Override // i8c
                            public final void a(Object obj, Object obj2) {
                                byte b3 = b2;
                                i8c i8cVar2 = i8cVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b3) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i8cVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            default:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine22 = cVar.b;
                    if (walletEngine22 != null) {
                        final byte b3 = 1;
                        walletEngine22.previewTonConnect(v25Var, new i8c() { // from class: h05
                            @Override // i8c
                            public final void a(Object obj, Object obj2) {
                                byte b32 = b3;
                                i8c i8cVar2 = i8cVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b32) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i8cVar.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
        }
    }
}
