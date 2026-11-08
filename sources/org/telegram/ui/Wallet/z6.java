package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v10 b;

    public /* synthetic */ z6(v10 v10Var, int i7) {
        this.a = i7;
        this.b = v10Var;
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
