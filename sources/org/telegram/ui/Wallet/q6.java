package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;

    public /* synthetic */ q6(int i10, Utilities.Callback2 callback2) {
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
