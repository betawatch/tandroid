package com.google.android.gms.location;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import s6.i;
import s7.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new i(15);
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
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        o.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        o.s(parcel, 4, 4);
        int i11 = this.d;
        parcel.writeInt(i11);
        o.o(parcel, 5, this.e, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        o.s(parcel, 6, 4);
        parcel.writeInt(i12);
        o.r(parcel, q6);
    }
}
