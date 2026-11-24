package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class LatLng extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new t0e((byte) 6);
    public final double a;
    public final double b;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.b = d2;
        }
        this.a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(latLng.a) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(latLng.b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.a + "," + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 8);
        parcel.writeDouble(this.a);
        mve.q(parcel, 3, 8);
        parcel.writeDouble(this.b);
        mve.s(parcel, r);
    }
}
