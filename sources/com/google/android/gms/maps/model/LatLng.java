package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import q7.j;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new j(12);
    public final double a;
    public final double b;

    public LatLng(double d, double d9) {
        if (d9 < -180.0d || d9 >= 180.0d) {
            this.b = ((((d9 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.b = d9;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 8);
        parcel.writeDouble(this.a);
        p8.s(parcel, 3, 8);
        parcel.writeDouble(this.b);
        p8.r(parcel, q10);
    }
}
