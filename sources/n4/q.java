package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new m8.h(5);
    public final h a;
    public final long b;
    public MediaSession.QueueItem c;

    public q(h hVar, long j10) {
        if (j10 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.a = hVar;
        this.b = j10;
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
        return a1.g.r(sb2, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.a.writeToParcel(parcel, i10);
        parcel.writeLong(this.b);
    }

    public q(Parcel parcel) {
        this.a = h.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
