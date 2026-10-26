package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ l0(int i10) {
        this.a = i10;
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
                return new Thread(runnable, "Lottie-" + xj0.P0.getAndIncrement());
            case 3:
                return new Thread(runnable, "LottieLow-" + xj0.Q0.getAndIncrement());
            case 4:
                Thread thread2 = new Thread(new s51(runnable, 12), "widget-sandbox-io");
                thread2.setDaemon(true);
                return thread2;
            case 5:
                return new Thread(runnable, "GramWalletStorage");
            case 6:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
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
