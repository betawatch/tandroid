package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ q10 d;
    public final /* synthetic */ k2 e;

    public /* synthetic */ x(u0 u0Var, boolean[] zArr, q10 q10Var, k2 k2Var, int i7) {
        this.a = i7;
        this.b = u0Var;
        this.c = zArr;
        this.d = q10Var;
        this.e = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final boolean[] zArr = this.c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = this.b.b;
                    final q10 q10Var = this.d;
                    if (walletEngine2 != null) {
                        final int i7 = 0;
                        walletEngine2.previewTonConnect(this.e, new q10() { // from class: org.telegram.ui.Wallet.z
                            @Override // org.telegram.messenger.q10
                            public final void a(Object obj, Object obj2) {
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (i7) {
                                    case 0:
                                        if (!zArr[0]) {
                                            q10Var.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr[0]) {
                                            q10Var.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        q10Var.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            default:
                final boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    WalletEngine2 walletEngine22 = this.b.b;
                    final q10 q10Var2 = this.d;
                    if (walletEngine22 != null) {
                        final int i10 = 1;
                        walletEngine22.previewTonConnect(this.e, new q10() { // from class: org.telegram.ui.Wallet.z
                            @Override // org.telegram.messenger.q10
                            public final void a(Object obj, Object obj2) {
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (i10) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            q10Var2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            q10Var2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        q10Var2.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
        }
    }
}
