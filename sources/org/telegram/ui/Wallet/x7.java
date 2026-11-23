package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.r10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ r10 c;

    public /* synthetic */ x7(AtomicBoolean atomicBoolean, r10 r10Var, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = r10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(this.b, this.c);
                break;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(this.b, this.c);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(this.b, this.c);
                break;
        }
    }
}
