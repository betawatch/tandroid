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
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new j(10);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f7, float f10, float f11) {
        l.i(latLng, "camera target must not be null.");
        l.c(f10 >= 0.0f && f10 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f10));
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
        e eVar = new e(this);
        eVar.g(this.a, "target");
        eVar.g(Float.valueOf(this.b), "zoom");
        eVar.g(Float.valueOf(this.c), "tilt");
        eVar.g(Float.valueOf(this.d), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 2, this.a, i10);
        f0.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        f0.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        f0.s(parcel, 5, 4);
        parcel.writeFloat(this.d);
        f0.r(parcel, q6);
    }
}
