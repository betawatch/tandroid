package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ FutureTask c;

    public /* synthetic */ z6(AtomicBoolean atomicBoolean, FutureTask futureTask, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = futureTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WalletEngine2.lambda$emulateSend$18(this.b, this.c);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$23(this.b, this.c);
                break;
        }
    }
}
