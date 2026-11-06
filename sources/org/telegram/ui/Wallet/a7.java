package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v10 b;

    public /* synthetic */ a7(v10 v10Var, int i7) {
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
