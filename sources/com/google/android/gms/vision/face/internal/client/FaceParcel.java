package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c.c;
import g7.p8;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new c(18);
    public final float A;
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
    public final float v;
    public final float w;
    public final float x;
    public final e8.a[] y;

    public FaceParcel(int i9, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, e8.a[] aVarArr, float f20) {
        this.a = i9;
        this.b = i10;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = f13;
        this.h = f14;
        this.n = f15;
        this.r = f16;
        this.s = landmarkParcelArr;
        this.v = f17;
        this.w = f18;
        this.x = f19;
        this.y = aVarArr;
        this.A = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        p8.s(parcel, 4, 4);
        parcel.writeFloat(this.d);
        p8.s(parcel, 5, 4);
        parcel.writeFloat(this.e);
        p8.s(parcel, 6, 4);
        parcel.writeFloat(this.f);
        p8.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        p8.s(parcel, 8, 4);
        parcel.writeFloat(this.n);
        p8.o(parcel, 9, this.s, i9);
        p8.s(parcel, 10, 4);
        parcel.writeFloat(this.v);
        p8.s(parcel, 11, 4);
        parcel.writeFloat(this.w);
        p8.s(parcel, 12, 4);
        parcel.writeFloat(this.x);
        p8.o(parcel, 13, this.y, i9);
        p8.s(parcel, 14, 4);
        parcel.writeFloat(this.r);
        p8.s(parcel, 15, 4);
        parcel.writeFloat(this.A);
        p8.r(parcel, q10);
    }

    public FaceParcel(int i9, int i10, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i9, i10, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new e8.a[0], -1.0f);
    }
}
