package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import r6.a;
import u8.o;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new o(16);
    public final x8.a[] D;
    public final float E;
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float h;
    public final float n;
    public final float r;
    public final LandmarkParcel[] s;
    public final float w;
    public final float x;
    public final float y;

    public FaceParcel(int i7, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, x8.a[] aVarArr, float f20) {
        this.a = i7;
        this.b = i10;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = f13;
        this.h = f14;
        this.n = f15;
        this.r = f16;
        this.s = landmarkParcelArr;
        this.w = f17;
        this.x = f18;
        this.y = f19;
        this.D = aVarArr;
        this.E = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        xb.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        xb.q(parcel, 4, 4);
        parcel.writeFloat(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeFloat(this.e);
        xb.q(parcel, 6, 4);
        parcel.writeFloat(this.f);
        xb.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        xb.q(parcel, 8, 4);
        parcel.writeFloat(this.n);
        xb.o(parcel, 9, this.s, i7);
        xb.q(parcel, 10, 4);
        parcel.writeFloat(this.w);
        xb.q(parcel, 11, 4);
        parcel.writeFloat(this.x);
        xb.q(parcel, 12, 4);
        parcel.writeFloat(this.y);
        xb.o(parcel, 13, this.D, i7);
        xb.q(parcel, 14, 4);
        parcel.writeFloat(this.r);
        xb.q(parcel, 15, 4);
        parcel.writeFloat(this.E);
        xb.s(parcel, r10);
    }

    public FaceParcel(int i7, int i10, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i7, i10, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new x8.a[0], -1.0f);
    }
}
