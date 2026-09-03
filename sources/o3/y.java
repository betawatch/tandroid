package o3;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class y {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, k3.k kVar) {
        LogSessionId logSessionId;
        k3.j jVar = kVar.a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionId2);
    }
}
