package com.google.android.gms.maps.model;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import s6.i;
import v5.n;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new i(22);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f9, float f10, float f11) {
        l.i(latLng, "camera target must not be null.");
        l.c(f10 >= 0.0f && f10 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f10));
        this.a = latLng;
        this.b = f9;
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
        n nVar = new n(this);
        nVar.g(this.a, "target");
        nVar.g(Float.valueOf(this.b), "zoom");
        nVar.g(Float.valueOf(this.c), "tilt");
        nVar.g(Float.valueOf(this.d), "bearing");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.a, i10);
        o.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        o.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        o.s(parcel, 5, 4);
        parcel.writeFloat(this.d);
        o.r(parcel, q6);
    }
}
