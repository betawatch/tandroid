package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.b;
import j8.g;
import java.util.Arrays;
import r6.a;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new b(22);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final g[] e;

    public LocationAvailability(int i7, int i10, int i11, long j3, g[] gVarArr) {
        this.d = i7 < 1000 ? 0 : 1000;
        this.a = i10;
        this.b = i11;
        this.c = j3;
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        bc.q(parcel, 4, 4);
        int i10 = this.d;
        parcel.writeInt(i10);
        bc.o(parcel, 5, this.e, i7);
        int i11 = i10 >= 1000 ? 0 : 1;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        bc.s(parcel, r10);
    }
}
