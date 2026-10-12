package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                return new Thread(runnable, "RoundVideoFiles");
            case 2:
                return new Thread(runnable, "RoundVideoOutput");
            case 3:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 4:
                return new Thread(runnable, "Lottie-" + yj0.P0.getAndIncrement());
            case 5:
                return new Thread(runnable, "LottieLow-" + yj0.Q0.getAndIncrement());
            case 6:
                return new Thread(runnable, "GramWalletStorage");
            case 7:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            case 8:
                return new Thread(runnable, "AudioRecorderFiles");
            default:
                return new Thread(runnable, "AudioRecorderOutput");
        }
    }
}
