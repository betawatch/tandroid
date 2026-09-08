package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(4);
    public final int a;
    public final MediaDescriptionCompat b;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.a = i10;
        this.b = mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i10);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
