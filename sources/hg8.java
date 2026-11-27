// default package

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hg8 {
    public LogSessionId a;

    public hg8() {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        this.a = logSessionId;
    }

    public final void a(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        LogSessionId logSessionId3 = this.a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        yve.p(logSessionId3.equals(logSessionId2));
        this.a = logSessionId;
    }
}
