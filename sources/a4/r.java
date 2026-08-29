package a4;

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(l lVar, k3.k kVar) {
        LogSessionId logSessionId;
        k3.j jVar = kVar.a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        lVar.b.setString("log-session-id", logSessionId2.getStringId());
    }
}
