// default package

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class nk7 {
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.b);
        }
        return mediaStyle;
    }

    public static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
