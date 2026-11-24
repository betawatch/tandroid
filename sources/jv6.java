// default package

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jv6 implements Parcelable {
    public static final Parcelable.Creator<jv6> CREATOR = new hv6((byte) 0);
    public final kq6 a;
    public final long b;
    public MediaSession.QueueItem c;

    public jv6(kq6 kq6Var, long j) {
        if (j == -1) {
            w26.j("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.a = kq6Var;
        this.b = j;
        this.c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return ls6.p(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public jv6(Parcel parcel) {
        this.a = kq6.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
