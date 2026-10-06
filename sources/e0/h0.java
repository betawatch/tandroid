package e0;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public abstract class h0 {
    public static RenderEffect a;

    public static RenderEffect a() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static k2.f b(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return k2.f.d;
        }
        ac.d dVar = new ac.d();
        boolean z11 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
        dVar.a = true;
        dVar.b = z11;
        dVar.c = z10;
        return dVar.a();
    }

    public static RenderEffect c() {
        if (a == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            a = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return a;
    }

    public static boolean d(MediaDrm mediaDrm, String str, int i10) {
        return mediaDrm.requiresSecureDecoder(str, i10);
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void f(AudioTrack audioTrack, j2.k kVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(a2);
    }

    public static void g(MediaDrm mediaDrm, byte[] bArr, j2.k kVar) {
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

    public static void h(com.google.firebase.messaging.n nVar, j2.k kVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) nVar.b).setString("log-session-id", a2.getStringId());
    }

    public static void i(n4.y yVar, ComponentName componentName) {
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
