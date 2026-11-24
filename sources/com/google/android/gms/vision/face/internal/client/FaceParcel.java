package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class FaceParcel extends b4 {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new jid((byte) 21);
    public final w6d[] E;
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

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new w6d[0], -1.0f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        mve.q(parcel, 4, 4);
        parcel.writeFloat(this.d);
        mve.q(parcel, 5, 4);
        parcel.writeFloat(this.e);
        mve.q(parcel, 6, 4);
        parcel.writeFloat(this.f);
        mve.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        mve.q(parcel, 8, 4);
        parcel.writeFloat(this.n);
        mve.o(parcel, 9, this.s, i);
        mve.q(parcel, 10, 4);
        parcel.writeFloat(this.w);
        mve.q(parcel, 11, 4);
        parcel.writeFloat(this.x);
        mve.q(parcel, 12, 4);
        parcel.writeFloat(this.y);
        mve.o(parcel, 13, this.E, i);
        mve.q(parcel, 14, 4);
        parcel.writeFloat(this.r);
        mve.q(parcel, 15, 4);
        parcel.writeFloat(this.F);
        mve.s(parcel, r);
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, w6d[] w6dVarArr, float f11) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.h = f5;
        this.n = f6;
        this.r = f7;
        this.s = landmarkParcelArr;
        this.w = f8;
        this.x = f9;
        this.y = f10;
        this.E = w6dVarArr;
        this.F = f11;
    }
}
