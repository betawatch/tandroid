package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import bf.b;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.g5;
import java.util.Arrays;
import u6.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new p(13);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        m.i(latLng, "camera target must not be null.");
        m.c(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.a = latLng;
        this.b = f10;
        this.c = f11 + 0.0f;
        this.d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
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
        b bVar = new b(this);
        bVar.r(this.a, "target");
        bVar.r(Float.valueOf(this.b), "zoom");
        bVar.r(Float.valueOf(this.c), "tilt");
        bVar.r(Float.valueOf(this.d), "bearing");
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        g5.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        g5.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        g5.s(parcel, 5, 4);
        parcel.writeFloat(this.d);
        g5.r(parcel, q10);
    }
}
