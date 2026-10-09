package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;

    public /* synthetic */ g6(int i10, Utilities.Callback2 callback2) {
        this.a = i10;
        this.b = callback2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(null, "Wallet engine is closed");
                break;
            case 1:
                this.b.run(null, "NO_WALLET_ENGINE");
                break;
            case 2:
                this.b.run(null, "NO_WALLET_ENGINE");
                break;
            case 3:
                this.b.run(null, "Recovery phrase is required");
                break;
            case 4:
                this.b.run(null, "Transaction hash is required");
                break;
            case 5:
                this.b.run(null, "NO_WALLET_ENGINE");
                break;
            case 6:
                this.b.run(null, "NO_WALLET_ENGINE");
                break;
            default:
                this.b.run(null, "NO_WALLET_ENGINE");
                break;
        }
    }
}
