package com.google.android.gms.location;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h8.j;
import h8.k;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import p6.a;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new j(4);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final k[] e;

    public LocationAvailability(int i10, int i11, int i12, long j10, k[] kVarArr) {
        this.d = i10 < 1000 ? 0 : MediaDataController.MAX_STYLE_RUNS_COUNT;
        this.a = i11;
        this.b = i12;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        df.s(parcel, 4, 4);
        int i11 = this.d;
        parcel.writeInt(i11);
        df.o(parcel, 5, this.e, i10);
        int i12 = i11 >= 1000 ? 0 : 1;
        df.s(parcel, 6, 4);
        parcel.writeInt(i12);
        df.r(parcel, q5);
    }
}
