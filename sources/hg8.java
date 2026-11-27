// default package

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
