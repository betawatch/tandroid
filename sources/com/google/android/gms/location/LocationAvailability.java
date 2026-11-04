package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i7.p;
import i8.g;
import java.util.Arrays;
import q6.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new p(7);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final g[] e;

    public LocationAvailability(int i3, int i10, int i11, long j10, g[] gVarArr) {
        this.d = i3 < 1000 ? 0 : 1000;
        this.a = i10;
        this.b = i11;
        this.c = j10;
        this.e = gVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "LocationAvailability[" + (this.d < 1000) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.c);
        j8.a.r(parcel, 4, 4);
        int i10 = this.d;
        parcel.writeInt(i10);
        j8.a.p(parcel, 5, this.e, i3);
        int i11 = i10 >= 1000 ? 0 : 1;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i11);
        j8.a.t(parcel, s6);
    }
}
