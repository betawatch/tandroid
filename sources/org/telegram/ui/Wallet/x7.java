package org.telegram.ui.Wallet;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ q10 c;

    public /* synthetic */ x7(AtomicBoolean atomicBoolean, q10 q10Var, int i7) {
        this.a = i7;
        this.b = atomicBoolean;
        this.c = q10Var;
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
