// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class et6 extends b4 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final ce6 e = new ce6("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<et6> CREATOR = new jid((byte) 1);

    public et6(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et6)) {
            return false;
        }
        et6 et6Var = (et6) obj;
        return this.a == et6Var.a && this.b == et6Var.b && this.c == et6Var.c && this.d == et6Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        mve.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.s(parcel, r);
    }
}
