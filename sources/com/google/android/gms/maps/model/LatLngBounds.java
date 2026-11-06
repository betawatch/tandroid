package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j2.n;
import java.util.Arrays;
import m6.e;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new e(4);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        m.h(latLng, "southwest must not be null.");
        m.h(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        if (d >= d2) {
            this.a = latLng;
            this.b = latLng2;
            return;
        }
        throw new IllegalArgumentException("southern latitude exceeds northern latitude (" + d2 + " > " + d + ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.X(this.a, "southwest");
        nVar.X(this.b, "northeast");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.a, i7);
        wb.k(parcel, 3, this.b, i7);
        wb.s(parcel, r10);
    }
}
