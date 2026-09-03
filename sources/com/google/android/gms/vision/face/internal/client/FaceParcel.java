package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import f8.o;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new o(9);
    public final float B;
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
    public final i8.a[] y;

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, i8.a[] aVarArr, float f20) {
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
        this.B = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g5.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        g5.s(parcel, 4, 4);
        parcel.writeFloat(this.d);
        g5.s(parcel, 5, 4);
        parcel.writeFloat(this.e);
        g5.s(parcel, 6, 4);
        parcel.writeFloat(this.f);
        g5.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        g5.s(parcel, 8, 4);
        parcel.writeFloat(this.n);
        g5.o(parcel, 9, this.s, i10);
        g5.s(parcel, 10, 4);
        parcel.writeFloat(this.v);
        g5.s(parcel, 11, 4);
        parcel.writeFloat(this.w);
        g5.s(parcel, 12, 4);
        parcel.writeFloat(this.x);
        g5.o(parcel, 13, this.y, i10);
        g5.s(parcel, 14, 4);
        parcel.writeFloat(this.r);
        g5.s(parcel, 15, 4);
        parcel.writeFloat(this.B);
        g5.r(parcel, q10);
    }

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i10, i11, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new i8.a[0], -1.0f);
    }
}
