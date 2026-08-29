package h4;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new g8.b(7);
    public final long a;
    public final long b;
    public final int c;

    public c(long j10, long j11, int i10) {
        f5.a.f(j10 < j11);
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
        StringBuilder r6 = w.r(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        r6.append(this.b);
        r6.append(", speedDivisor=");
        r6.append(this.c);
        return r6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
