package h3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static i3.l a(Context context, k0 k0Var, boolean z10) {
        LogSessionId logSessionId;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        i3.j jVar = mediaMetricsManager == null ? null : new i3.j(context, mediaMetricsManager.createPlaybackSession());
        if (jVar == null) {
            d5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new i3.l(logSessionId);
        }
        if (z10) {
            i3.f fVar = k0Var.r;
            fVar.getClass();
            fVar.f.a(jVar);
        }
        return new i3.l(jVar.c.getSessionId());
    }
}
