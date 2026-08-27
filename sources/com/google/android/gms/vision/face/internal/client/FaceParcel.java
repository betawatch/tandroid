package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import f4.e;
import h7.r8;
import z5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new e(2);
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
    public final f8.a[] y;

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, f8.a[] aVarArr, float f20) {
        this.a = i10;
        this.b = i11;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        r8.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        r8.s(parcel, 4, 4);
        parcel.writeFloat(this.d);
        r8.s(parcel, 5, 4);
        parcel.writeFloat(this.e);
        r8.s(parcel, 6, 4);
        parcel.writeFloat(this.f);
        r8.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        r8.s(parcel, 8, 4);
        parcel.writeFloat(this.n);
        r8.o(parcel, 9, this.s, i10);
        r8.s(parcel, 10, 4);
        parcel.writeFloat(this.v);
        r8.s(parcel, 11, 4);
        parcel.writeFloat(this.w);
        r8.s(parcel, 12, 4);
        parcel.writeFloat(this.x);
        r8.o(parcel, 13, this.y, i10);
        r8.s(parcel, 14, 4);
        parcel.writeFloat(this.r);
        r8.s(parcel, 15, 4);
        parcel.writeFloat(this.A);
        r8.r(parcel, q6);
    }

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i10, i11, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new f8.a[0], -1.0f);
    }
}
