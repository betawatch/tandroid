package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g8.g;
import g8.h;
import java.util.Arrays;
import o6.a;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new g(3);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final h[] e;

    public LocationAvailability(int i10, int i11, int i12, long j10, h[] hVarArr) {
        this.d = i10 < 1000 ? 0 : 1000;
        this.a = i11;
        this.b = i12;
        this.c = j10;
        this.e = hVarArr;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        h0.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        h0.s(parcel, 4, 4);
        int i11 = this.d;
        parcel.writeInt(i11);
        h0.o(parcel, 5, this.e, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        h0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        h0.r(parcel, q6);
    }
}
