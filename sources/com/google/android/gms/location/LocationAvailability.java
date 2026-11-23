package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.b;
import j8.g;
import java.util.Arrays;
import r6.a;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        cc.q(parcel, 4, 4);
        int i10 = this.d;
        parcel.writeInt(i10);
        cc.o(parcel, 5, this.e, i7);
        int i11 = i10 >= 1000 ? 0 : 1;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        cc.s(parcel, r10);
    }
}
