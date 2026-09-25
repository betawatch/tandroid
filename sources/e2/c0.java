package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                return new Thread(runnable, "Lottie-" + ij0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + ij0.Q0.getAndIncrement());
        }
    }
}
