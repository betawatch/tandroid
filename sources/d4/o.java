package d4;

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
