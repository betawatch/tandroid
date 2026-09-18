package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ThreadFactory {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "Lottie-" + yi0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + yi0.Q0.getAndIncrement());
        }
    }
}
