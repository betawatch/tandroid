package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new hx6((byte) 1);
    public final MediaDescriptionCompat a;
    public final long b;
    public MediaSession.QueueItem c;

    public MediaSessionCompat$QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            u36.j("Description cannot be null");
            throw null;
        }
        if (j == -1) {
            u36.j("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.a = mediaDescriptionCompat;
        this.b = j;
        this.c = queueItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return kt6.q(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
