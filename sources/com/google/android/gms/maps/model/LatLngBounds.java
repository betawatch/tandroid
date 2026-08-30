package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import bf.b;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.f5;
import java.util.Arrays;
import u6.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new p(15);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        m.i(latLng, "southwest must not be null.");
        m.i(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d10 = latLng.a;
        m.c(d >= d10, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d10), Double.valueOf(d));
        this.a = latLng;
        this.b = latLng2;
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
        b bVar = new b(this);
        bVar.s(this.a, "southwest");
        bVar.s(this.b, "northeast");
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.a, i10);
        f5.k(parcel, 3, this.b, i10);
        f5.r(parcel, q10);
    }
}
