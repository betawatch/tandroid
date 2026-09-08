package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(5);
    public final l a;
    public final long b;
    public MediaSession.QueueItem c;

    public v(l lVar, long j3) {
        if (j3 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.a = lVar;
        this.b = j3;
        this.c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem { Description=");
        sb2.append(this.a);
        sb2.append(", Id=");
        return a4.a.r(sb2, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.a.writeToParcel(parcel, i10);
        parcel.writeLong(this.b);
    }

    public v(Parcel parcel) {
        this.a = l.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
