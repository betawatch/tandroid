package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
