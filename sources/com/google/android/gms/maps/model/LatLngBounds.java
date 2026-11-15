package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import ji.j;
import m6.e;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        j jVar = new j(this);
        jVar.U(this.a, "southwest");
        jVar.U(this.b, "northeast");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.a, i7);
        yb.k(parcel, 3, this.b, i7);
        yb.s(parcel, r10);
    }
}
