package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import o6.a;
import p7.j;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new j(25);
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
    public final float v;
    public final float w;
    public final float x;
    public final u8.a[] y;

    public FaceParcel(int i10, int i11, float f7, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18, u8.a[] aVarArr, float f19) {
        this.a = i10;
        this.b = i11;
        this.c = f7;
        this.d = f10;
        this.e = f11;
        this.f = f12;
        this.h = f13;
        this.n = f14;
        this.r = f15;
        this.s = landmarkParcelArr;
        this.v = f16;
        this.w = f17;
        this.x = f18;
        this.y = aVarArr;
        this.E = f19;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        e0.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        e0.s(parcel, 4, 4);
        parcel.writeFloat(this.d);
        e0.s(parcel, 5, 4);
        parcel.writeFloat(this.e);
        e0.s(parcel, 6, 4);
        parcel.writeFloat(this.f);
        e0.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        e0.s(parcel, 8, 4);
        parcel.writeFloat(this.n);
        e0.o(parcel, 9, this.s, i10);
        e0.s(parcel, 10, 4);
        parcel.writeFloat(this.v);
        e0.s(parcel, 11, 4);
        parcel.writeFloat(this.w);
        e0.s(parcel, 12, 4);
        parcel.writeFloat(this.x);
        e0.o(parcel, 13, this.y, i10);
        e0.s(parcel, 14, 4);
        parcel.writeFloat(this.r);
        e0.s(parcel, 15, 4);
        parcel.writeFloat(this.E);
        e0.r(parcel, q6);
    }

    public FaceParcel(int i10, int i11, float f7, float f10, float f11, float f12, float f13, float f14, LandmarkParcel[] landmarkParcelArr, float f15, float f16, float f17) {
        this(i10, i11, f7, f10, f11, f12, f13, f14, 0.0f, landmarkParcelArr, f15, f16, f17, new u8.a[0], -1.0f);
    }
}
