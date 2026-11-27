// default package

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hsc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ icc c;

    public /* synthetic */ hsc(AtomicBoolean atomicBoolean, icc iccVar, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = iccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        icc iccVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(atomicBoolean, iccVar);
                break;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(atomicBoolean, iccVar);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(atomicBoolean, iccVar);
                break;
        }
    }
}
