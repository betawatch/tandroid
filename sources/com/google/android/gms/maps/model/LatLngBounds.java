package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g8.j;
import java.util.Arrays;
import m5.e;
import n6.l;
import o6.a;
import w7.f0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new j(12);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        l.i(latLng, "southwest must not be null.");
        l.i(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d10 = latLng.a;
        l.c(d >= d10, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d10), Double.valueOf(d));
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
        e eVar = new e(this);
        eVar.g(this.a, "southwest");
        eVar.g(this.b, "northeast");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.a, i10);
        f0.k(parcel, 3, this.b, i10);
        f0.r(parcel, q6);
    }
}
