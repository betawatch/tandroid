package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import java.util.Arrays;
import q7.j;
import w4.e;
import x5.l;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new j(9);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        l.i(latLng, "camera target must not be null.");
        l.c(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
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
        e eVar = new e(this);
        eVar.c(this.a, "target");
        eVar.c(Float.valueOf(this.b), "zoom");
        eVar.c(Float.valueOf(this.c), "tilt");
        eVar.c(Float.valueOf(this.d), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        p8.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        p8.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        p8.s(parcel, 5, 4);
        parcel.writeFloat(this.d);
        p8.r(parcel, q10);
    }
}
