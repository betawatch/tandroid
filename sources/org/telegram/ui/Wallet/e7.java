package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k20 b;

    public /* synthetic */ e7(k20 k20Var, int i10) {
        this.a = i10;
        this.b = k20Var;
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
