package com.google.android.gms.maps.model;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h8.j;
import java.util.Arrays;
import m4.w1;
import o6.l;
import p6.a;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        w1 w1Var = new w1(this);
        w1Var.x(this.a, "target");
        w1Var.x(Float.valueOf(this.b), "zoom");
        w1Var.x(Float.valueOf(this.c), "tilt");
        w1Var.x(Float.valueOf(this.d), "bearing");
        return w1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.a, i10);
        df.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        df.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        df.s(parcel, 5, 4);
        parcel.writeFloat(this.d);
        df.r(parcel, q5);
    }
}
