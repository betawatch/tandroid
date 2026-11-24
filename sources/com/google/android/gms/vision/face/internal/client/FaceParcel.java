package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class FaceParcel extends b4 {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new igd((byte) 21);
    public final u4d[] E;
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
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new u4d[0], -1.0f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeFloat(this.d);
        jte.q(parcel, 5, 4);
        parcel.writeFloat(this.e);
        jte.q(parcel, 6, 4);
        parcel.writeFloat(this.f);
        jte.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        jte.q(parcel, 8, 4);
        parcel.writeFloat(this.n);
        jte.o(parcel, 9, this.s, i);
        jte.q(parcel, 10, 4);
        parcel.writeFloat(this.w);
        jte.q(parcel, 11, 4);
        parcel.writeFloat(this.x);
        jte.q(parcel, 12, 4);
        parcel.writeFloat(this.y);
        jte.o(parcel, 13, this.E, i);
        jte.q(parcel, 14, 4);
        parcel.writeFloat(this.r);
        jte.q(parcel, 15, 4);
        parcel.writeFloat(this.F);
        jte.s(parcel, r);
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, u4d[] u4dVarArr, float f11) {
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
        this.E = u4dVarArr;
        this.F = f11;
    }
}
