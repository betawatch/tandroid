package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
