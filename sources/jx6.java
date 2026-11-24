// default package

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jx6 implements Parcelable {
    public static final Parcelable.Creator<jx6> CREATOR = new hx6((byte) 0);
    public final ks6 a;
    public final long b;
    public MediaSession.QueueItem c;

    public jx6(ks6 ks6Var, long j) {
        if (j == -1) {
            u36.j("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.a = ks6Var;
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
        return kt6.q(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public jx6(Parcel parcel) {
        this.a = ks6.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
