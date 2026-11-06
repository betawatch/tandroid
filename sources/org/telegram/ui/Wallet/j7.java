package org.telegram.ui.Wallet;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ FutureTask c;

    public /* synthetic */ j7(AtomicBoolean atomicBoolean, FutureTask futureTask, int i7) {
        this.a = i7;
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
