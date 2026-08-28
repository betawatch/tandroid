package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import q7.j;
import q7.k;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new j(3);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final k[] e;

    public LocationAvailability(int i9, int i10, int i11, long j10, k[] kVarArr) {
        this.d = i9 < 1000 ? 0 : MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.a = i10;
        this.b = i11;
        this.c = j10;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        p8.s(parcel, 4, 4);
        int i10 = this.d;
        parcel.writeInt(i10);
        p8.o(parcel, 5, this.e, i9);
        int i11 = i10 >= 1000 ? 0 : 1;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i11);
        p8.r(parcel, q10);
    }
}
