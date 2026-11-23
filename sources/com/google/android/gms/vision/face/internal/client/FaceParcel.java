package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import r6.a;
import u8.o;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new o(16);
    public final x8.a[] E;
    public final float F;
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
        this.E = aVarArr;
        this.F = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        cc.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        cc.q(parcel, 4, 4);
        parcel.writeFloat(this.d);
        cc.q(parcel, 5, 4);
        parcel.writeFloat(this.e);
        cc.q(parcel, 6, 4);
        parcel.writeFloat(this.f);
        cc.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        cc.q(parcel, 8, 4);
        parcel.writeFloat(this.n);
        cc.o(parcel, 9, this.s, i7);
        cc.q(parcel, 10, 4);
        parcel.writeFloat(this.w);
        cc.q(parcel, 11, 4);
        parcel.writeFloat(this.x);
        cc.q(parcel, 12, 4);
        parcel.writeFloat(this.y);
        cc.o(parcel, 13, this.E, i7);
        cc.q(parcel, 14, 4);
        parcel.writeFloat(this.r);
        cc.q(parcel, 15, 4);
        parcel.writeFloat(this.F);
        cc.s(parcel, r10);
    }

    public FaceParcel(int i7, int i10, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i7, i10, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new x8.a[0], -1.0f);
    }
}
