package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ r10 d;
    public final /* synthetic */ k2 e;

    public /* synthetic */ x(u0 u0Var, boolean[] zArr, r10 r10Var, k2 k2Var, int i7) {
        this.a = i7;
        this.b = u0Var;
        this.c = zArr;
        this.d = r10Var;
        this.e = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final boolean[] zArr = this.c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = this.b.b;
                    final r10 r10Var = this.d;
                    if (walletEngine2 != null) {
                        final int i7 = 0;
                        walletEngine2.previewTonConnect(this.e, new r10() { // from class: org.telegram.ui.Wallet.z
                            @Override // org.telegram.messenger.r10
                            public final void a(Object obj, Object obj2) {
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (i7) {
                                    case 0:
                                        if (!zArr[0]) {
                                            r10Var.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr[0]) {
                                            r10Var.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        r10Var.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            default:
                final boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    WalletEngine2 walletEngine22 = this.b.b;
                    final r10 r10Var2 = this.d;
                    if (walletEngine22 != null) {
                        final int i10 = 1;
                        walletEngine22.previewTonConnect(this.e, new r10() { // from class: org.telegram.ui.Wallet.z
                            @Override // org.telegram.messenger.r10
                            public final void a(Object obj, Object obj2) {
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (i10) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            r10Var2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            r10Var2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        r10Var2.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
        }
    }
}
