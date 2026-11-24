package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class LocationAvailability extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new yhf((byte) 6);
    public final int a;
    public final int b;
    public final long c;
    public final short d;
    public final x7d[] e;

    public LocationAvailability(int i, int i2, int i3, long j, x7d[] x7dVarArr) {
        this.d = i < 1000 ? (short) 0 : (short) 1000;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = x7dVarArr;
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
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        mve.q(parcel, 4, 4);
        short s = this.d;
        parcel.writeInt(s);
        mve.o(parcel, 5, this.e, i);
        int i2 = s >= 1000 ? 0 : 1;
        mve.q(parcel, 6, 4);
        parcel.writeInt(i2);
        mve.s(parcel, r);
    }
}
