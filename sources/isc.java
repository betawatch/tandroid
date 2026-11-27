// default package

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class isc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ FutureTask c;

    public /* synthetic */ isc(AtomicBoolean atomicBoolean, FutureTask futureTask, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = futureTask;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FutureTask futureTask = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$21(atomicBoolean, futureTask);
                break;
            default:
                WalletEngine2.lambda$emulateSendNFT$26(atomicBoolean, futureTask);
                break;
        }
    }
}
