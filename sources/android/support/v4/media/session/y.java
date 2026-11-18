package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class y {
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
