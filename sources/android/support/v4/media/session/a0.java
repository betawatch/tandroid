package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j3) {
        return new MediaSession.QueueItem(mediaDescription, j3);
    }

    public static MediaDescription b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
