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
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new e(2);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        m.h(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f11);
        }
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
        jVar.U(this.a, "target");
        jVar.U(Float.valueOf(this.b), "zoom");
        jVar.U(Float.valueOf(this.c), "tilt");
        jVar.U(Float.valueOf(this.d), "bearing");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.a, i7);
        yb.q(parcel, 3, 4);
        parcel.writeFloat(this.b);
        yb.q(parcel, 4, 4);
        parcel.writeFloat(this.c);
        yb.q(parcel, 5, 4);
        parcel.writeFloat(this.d);
        yb.s(parcel, r10);
    }
}
