package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
