package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.r8;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import r6.l;
import r7.j;
import z5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new l(11);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final j[] e;

    public LocationAvailability(int i10, int i11, int i12, long j10, j[] jVarArr) {
        this.d = i10 < 1000 ? 0 : MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.a = i11;
        this.b = i12;
        this.c = j10;
        this.e = jVarArr;
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
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        r8.s(parcel, 4, 4);
        int i11 = this.d;
        parcel.writeInt(i11);
        r8.o(parcel, 5, this.e, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i12);
        r8.r(parcel, q6);
    }
}
