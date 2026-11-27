// default package

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class nx6 {
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
