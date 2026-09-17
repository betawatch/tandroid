package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
