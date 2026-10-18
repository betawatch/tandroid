package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class z {
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
