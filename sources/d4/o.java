package d4;

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(i iVar, k3.k kVar) {
        LogSessionId logSessionId;
        k3.j jVar = kVar.a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        iVar.b.setString("log-session-id", logSessionId2.getStringId());
    }
}
