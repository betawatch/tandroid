package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
