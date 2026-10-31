package di;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i10) {
        this.a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 1:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 2:
                return new Thread(runnable, "AudioRecorderFiles");
            case 3:
                return new Thread(runnable, "AudioRecorderOutput");
            case 4:
                return new Thread(runnable, "RoundVideoFiles");
            case 5:
                return new Thread(runnable, "RoundVideoOutput");
            case 6:
                return new Thread(runnable, "Lottie-" + bi0.P0.getAndIncrement());
            case 7:
                return new Thread(runnable, "LottieLow-" + bi0.Q0.getAndIncrement());
            case 8:
                return new Thread(runnable, "GramWalletStorage");
            case 9:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            default:
                Thread thread2 = new Thread(new org.telegram.utils.twidget.l(runnable, 3), "widget-sandbox-io");
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
