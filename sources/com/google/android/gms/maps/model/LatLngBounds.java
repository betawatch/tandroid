package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class LatLngBounds extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new urd(29);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        ite.i(latLng, "southwest must not be null.");
        ite.i(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        ite.c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
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
        wm4 wm4Var = new wm4(this);
        wm4Var.a(this.a, "southwest");
        wm4Var.a(this.b, "northeast");
        return wm4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.k(parcel, 3, this.b, i);
        mve.s(parcel, r);
    }
}
