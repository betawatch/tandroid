package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ y6(AtomicBoolean atomicBoolean, Utilities.Callback2 callback2, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = callback2;
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
