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
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new e(2);
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
        j jVar = new j(this);
        jVar.E(this.a, "target");
        jVar.E(Float.valueOf(this.b), "zoom");
        jVar.E(Float.valueOf(this.c), "tilt");
        jVar.E(Float.valueOf(this.d), "bearing");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.a, i7);
        bc.q(parcel, 3, 4);
        parcel.writeFloat(this.b);
        bc.q(parcel, 4, 4);
        parcel.writeFloat(this.c);
        bc.q(parcel, 5, 4);
        parcel.writeFloat(this.d);
        bc.s(parcel, r10);
    }
}
