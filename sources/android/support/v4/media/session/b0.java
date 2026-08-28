package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
        return new MediaSession.QueueItem(mediaDescription, j10);
    }

    public static MediaDescription b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
