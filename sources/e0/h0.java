package e0;

import android.app.Notification;
import android.content.ComponentName;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class h0 {
    public static k2.e a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return k2.e.d;
        }
        ac.d dVar = new ac.d();
        boolean z11 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
        dVar.a = true;
        dVar.b = z11;
        dVar.c = z10;
        return dVar.a();
    }

    public static boolean b(MediaDrm mediaDrm, String str, int i10) {
        return mediaDrm.requiresSecureDecoder(str, i10);
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void d(AudioTrack audioTrack, j2.k kVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(a2);
    }

    public static void e(MediaDrm mediaDrm, byte[] bArr, j2.k kVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(a2);
    }

    public static void f(com.google.firebase.messaging.n nVar, j2.k kVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) nVar.b).setString("log-session-id", a2.getStringId());
    }

    public static void g(n4.y yVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((n4.r) yVar.b).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e7) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e7;
            }
            e2.a.f("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e7);
        }
    }
}
