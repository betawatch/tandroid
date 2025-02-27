package androidx.media.app;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
abstract class NotificationCompat$Api21Impl {
    static Notification.MediaStyle createMediaStyle() {
        return new Notification.MediaStyle();
    }

    static Notification.MediaStyle fillInMediaStyle(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            setShowActionsInCompactView(mediaStyle, iArr);
        }
        if (token != null) {
            setMediaSession(mediaStyle, (MediaSession.Token) token.getToken());
        }
        return mediaStyle;
    }

    static void setMediaSession(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    static void setMediaStyle(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    static void setShowActionsInCompactView(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
