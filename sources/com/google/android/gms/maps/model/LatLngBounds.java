package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g8.g;
import java.util.Arrays;
import m4.c;
import n6.l;
import o6.a;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new g(11);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        l.h(latLng, "southwest must not be null.");
        l.h(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d10 = latLng.a;
        if (d >= d10) {
            this.a = latLng;
            this.b = latLng2;
            return;
        }
        throw new IllegalArgumentException("southern latitude exceeds northern latitude (" + d10 + " > " + d + ")");
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
        c cVar = new c(this);
        cVar.u(this.a, "southwest");
        cVar.u(this.b, "northeast");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.a, i10);
        h0.k(parcel, 3, this.b, i10);
        h0.r(parcel, q6);
    }
}
