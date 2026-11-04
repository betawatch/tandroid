package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n10 b;

    public /* synthetic */ y6(n10 n10Var, int i3) {
        this.a = i3;
        this.b = n10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(null, "Wallet engine is closed");
                break;
            case 1:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            case 2:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            case 3:
                this.b.a(null, "Recovery phrase is required");
                break;
            case 4:
                this.b.a(null, "Transaction hash is required");
                break;
            case 5:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            case 6:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            default:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
        }
    }
}
