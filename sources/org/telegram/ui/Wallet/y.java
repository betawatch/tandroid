package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ p10 d;
    public final /* synthetic */ l2 e;

    public /* synthetic */ y(v0 v0Var, boolean[] zArr, p10 p10Var, l2 l2Var, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = zArr;
        this.d = p10Var;
        this.e = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final boolean[] zArr = this.c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = this.b.b;
                    final p10 p10Var = this.d;
                    if (walletEngine2 != null) {
                        final int i7 = 0;
                        walletEngine2.previewTonConnect(this.e, new p10() { // from class: org.telegram.ui.Wallet.a0
                            @Override // org.telegram.messenger.p10
                            public final void a(Object obj, Object obj2) {
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (i7) {
                                    case 0:
                                        if (!zArr[0]) {
                                            p10Var.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr[0]) {
                                            p10Var.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        p10Var.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
            default:
                final boolean[] zArr2 = this.c;
                if (!zArr2[0]) {
                    WalletEngine2 walletEngine22 = this.b.b;
                    final p10 p10Var2 = this.d;
                    if (walletEngine22 != null) {
                        final int i10 = 1;
                        walletEngine22.previewTonConnect(this.e, new p10() { // from class: org.telegram.ui.Wallet.a0
                            @Override // org.telegram.messenger.p10
                            public final void a(Object obj, Object obj2) {
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (i10) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            p10Var2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!zArr2[0]) {
                                            p10Var2.a(wallettransaction, str);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        p10Var2.a(null, "NULL_ENGINE");
                        break;
                    }
                }
                break;
        }
    }
}
