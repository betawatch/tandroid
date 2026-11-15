package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class b {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
