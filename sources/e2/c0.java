package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ThreadFactory {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "RoundVideoFiles");
            case 2:
                return new Thread(runnable, "RoundVideoOutput");
            case 3:
                return new Thread(runnable, "Lottie-" + kj0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + kj0.Q0.getAndIncrement());
        }
    }
}
