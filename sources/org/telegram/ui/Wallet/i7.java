package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.s10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ s10 c;

    public /* synthetic */ i7(AtomicBoolean atomicBoolean, s10 s10Var, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = s10Var;
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
