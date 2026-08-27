package h3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static i3.k a(Context context, k0 k0Var, boolean z10) {
        LogSessionId logSessionId;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        i3.i iVar = mediaMetricsManager == null ? null : new i3.i(context, mediaMetricsManager.createPlaybackSession());
        if (iVar == null) {
            d5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new i3.k(logSessionId);
        }
        if (z10) {
            i3.f fVar = k0Var.r;
            fVar.getClass();
            fVar.f.a(iVar);
        }
        return new i3.k(iVar.c.getSessionId());
    }
}
