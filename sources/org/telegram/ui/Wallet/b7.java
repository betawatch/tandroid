package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ n10 c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ b7(WalletEngine2 walletEngine2, n10 n10Var, TL_wallet.walletTransaction wallettransaction, String str, int i3) {
        this.a = i3;
        this.b = walletEngine2;
        this.c = n10Var;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$previewTonConnect$1(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$emulateRotateKey$29(this.c, this.d, this.e);
                break;
        }
    }
}
