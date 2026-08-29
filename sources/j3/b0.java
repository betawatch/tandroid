package j3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static k3.k a(Context context, k0 k0Var, boolean z10) {
        LogSessionId logSessionId;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        k3.i iVar = mediaMetricsManager == null ? null : new k3.i(context, mediaMetricsManager.createPlaybackSession());
        if (iVar == null) {
            f5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new k3.k(logSessionId);
        }
        if (z10) {
            k3.f fVar = k0Var.r;
            fVar.getClass();
            fVar.f.a(iVar);
        }
        return new k3.k(iVar.c.getSessionId());
    }
}
