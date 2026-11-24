// default package

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ix6 {
    public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }

    public static MediaDescription b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
