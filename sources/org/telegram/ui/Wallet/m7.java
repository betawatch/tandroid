package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.j20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ j20 c;

    public /* synthetic */ m7(AtomicBoolean atomicBoolean, j20 j20Var, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = j20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WalletEngine2.lambda$emulateSend$17(this.b, this.c);
                break;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$21(this.b, this.c);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$22(this.b, this.c);
                break;
        }
    }
}
