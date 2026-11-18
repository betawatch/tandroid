package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import ji.j;
import m6.e;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new e(4);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        m.i(latLng, "southwest must not be null.");
        m.i(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        m.c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
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
        j jVar = new j(this);
        jVar.E(this.a, "southwest");
        jVar.E(this.b, "northeast");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.a, i7);
        bc.k(parcel, 3, this.b, i7);
        bc.s(parcel, r10);
    }
}
