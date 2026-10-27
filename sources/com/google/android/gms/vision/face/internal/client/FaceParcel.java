package com.google.android.gms.vision.face.internal.client;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import p6.a;
import q7.m;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new m(23);
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
    public final v8.a[] y;

    public FaceParcel(int i10, int i11, float f7, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18, v8.a[] aVarArr, float f19) {
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
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        df.s(parcel, 4, 4);
        parcel.writeFloat(this.d);
        df.s(parcel, 5, 4);
        parcel.writeFloat(this.e);
        df.s(parcel, 6, 4);
        parcel.writeFloat(this.f);
        df.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        df.s(parcel, 8, 4);
        parcel.writeFloat(this.n);
        df.o(parcel, 9, this.s, i10);
        df.s(parcel, 10, 4);
        parcel.writeFloat(this.v);
        df.s(parcel, 11, 4);
        parcel.writeFloat(this.w);
        df.s(parcel, 12, 4);
        parcel.writeFloat(this.x);
        df.o(parcel, 13, this.y, i10);
        df.s(parcel, 14, 4);
        parcel.writeFloat(this.r);
        df.s(parcel, 15, 4);
        parcel.writeFloat(this.E);
        df.r(parcel, q5);
    }

    public FaceParcel(int i10, int i11, float f7, float f10, float f11, float f12, float f13, float f14, LandmarkParcel[] landmarkParcelArr, float f15, float f16, float f17) {
        this(i10, i11, f7, f10, f11, f12, f13, f14, 0.0f, landmarkParcelArr, f15, f16, f17, new v8.a[0], -1.0f);
    }
}
