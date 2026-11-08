package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ v10 c;

    public /* synthetic */ h7(AtomicBoolean atomicBoolean, v10 v10Var, int i7) {
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
