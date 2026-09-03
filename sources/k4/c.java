package k4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j8.t;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new t(14);
    public final long a;
    public final long b;
    public final int c;

    public c(long j10, long j11, int i10) {
        h5.a.f(j10 < j11);
        this.a = j10;
        this.b = j11;
        this.c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b == cVar.b && this.c == cVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i10 = d0.a;
        Locale locale = Locale.US;
        StringBuilder s6 = android.support.v4.media.a.s(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        s6.append(this.b);
        s6.append(", speedDivisor=");
        s6.append(this.c);
        return s6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
