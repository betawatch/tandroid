package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ v10 c;

    public /* synthetic */ j7(AtomicBoolean atomicBoolean, v10 v10Var, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = v10Var;
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
