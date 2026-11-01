package n4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m8.i(4);
    public final h a;
    public final long b;
    public MediaSession.QueueItem c;

    public o(h hVar, long j10) {
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
        return a1.g.q(sb2, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.a.writeToParcel(parcel, i10);
        parcel.writeLong(this.b);
    }

    public o(Parcel parcel) {
        this.a = h.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
