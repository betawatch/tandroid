package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g8.j;
import g8.k;
import java.util.Arrays;
import o6.a;
import org.telegram.messenger.MediaDataController;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new j(4);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final k[] e;

    public LocationAvailability(int i10, int i11, int i12, long j3, k[] kVarArr) {
        this.d = i10 < 1000 ? 0 : MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.a = i11;
        this.b = i12;
        this.c = j3;
        this.e = kVarArr;
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
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        e0.s(parcel, 4, 4);
        int i11 = this.d;
        parcel.writeInt(i11);
        e0.o(parcel, 5, this.e, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        e0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        e0.r(parcel, q6);
    }
}
