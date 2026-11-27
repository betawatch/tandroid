package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class LocationAvailability extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new nkf((byte) 6);
    public final int a;
    public final int b;
    public final long c;
    public final short d;
    public final oad[] e;

    public LocationAvailability(int i, int i2, int i3, long j, oad[] oadVarArr) {
        this.d = i < 1000 ? (short) 0 : (short) 1000;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = oadVarArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "LocationAvailability[" + (this.d < 1000) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        bye.q(parcel, 4, 4);
        short s = this.d;
        parcel.writeInt(s);
        bye.o(parcel, 5, this.e, i);
        int i2 = s >= 1000 ? 0 : 1;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i2);
        bye.s(parcel, r);
    }
}
