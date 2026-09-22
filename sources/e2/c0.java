package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ThreadFactory {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "Lottie-" + xi0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + xi0.Q0.getAndIncrement());
        }
    }
}
