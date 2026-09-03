package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import u6.p;
import u7.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new p(7);
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
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        f5.s(parcel, 4, 4);
        int i11 = this.d;
        parcel.writeInt(i11);
        f5.o(parcel, 5, this.e, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        f5.r(parcel, q10);
    }
}
