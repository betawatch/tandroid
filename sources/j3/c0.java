package j3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(AudioTrack audioTrack, i3.l lVar) {
        LogSessionId logSessionId;
        i3.k kVar = lVar.a;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
