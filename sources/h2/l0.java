package h2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ l0(int i7) {
        this.a = i7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 2:
                return new Thread(runnable, "Lottie-" + zg0.P0.getAndIncrement());
            case 3:
                return new Thread(runnable, "LottieLow-" + zg0.Q0.getAndIncrement());
            case 4:
                return new Thread(runnable, "GramWalletStorage");
            case 5:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            case 6:
                Thread thread2 = new Thread(new org.telegram.utils.twidget.l(runnable, 3), "widget-sandbox-io");
                thread2.setDaemon(true);
                return thread2;
            case 7:
                return new Thread(runnable, "AudioRecorderFiles");
            case 8:
                return new Thread(runnable, "AudioRecorderOutput");
            case 9:
                return new Thread(runnable, "RoundVideoFiles");
            default:
                return new Thread(runnable, "RoundVideoOutput");
        }
    }
}
