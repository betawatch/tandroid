package j3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(AudioTrack audioTrack, i3.k kVar) {
        LogSessionId logSessionId;
        i3.j jVar = kVar.a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
