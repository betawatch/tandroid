package f4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new c.c(25);
    public final long a;
    public final long b;
    public final int c;

    public c(long j10, long j11, int i9) {
        d5.a.f(j10 < j11);
        this.a = j10;
        this.b = j11;
        this.c = i9;
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
        int i9 = f0.a;
        Locale locale = Locale.US;
        StringBuilder s10 = aa.d.s(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        s10.append(this.b);
        s10.append(", speedDivisor=");
        s10.append(this.c);
        return s10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
