package j3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class y {
    public static k3.k a(Context context, f0 f0Var, boolean z4) {
        LogSessionId logSessionId;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        k3.i iVar = mediaMetricsManager == null ? null : new k3.i(context, mediaMetricsManager.createPlaybackSession());
        if (iVar == null) {
            h5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new k3.k(logSessionId);
        }
        if (z4) {
            k3.f fVar = f0Var.q;
            fVar.getClass();
            fVar.f.a(iVar);
        }
        return new k3.k(iVar.c.getSessionId());
    }
}
