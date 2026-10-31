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
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new g(9);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f7, float f10, float f11) {
        l.h(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 90.0f) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f10);
        }
        this.a = latLng;
        this.b = f7;
        this.c = f10 + 0.0f;
        this.d = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        c cVar = new c(this);
        cVar.u(this.a, "target");
        cVar.u(Float.valueOf(this.b), "zoom");
        cVar.u(Float.valueOf(this.c), "tilt");
        cVar.u(Float.valueOf(this.d), "bearing");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.a, i10);
        h0.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        h0.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        h0.s(parcel, 5, 4);
        parcel.writeFloat(this.d);
        h0.r(parcel, q6);
    }
}
