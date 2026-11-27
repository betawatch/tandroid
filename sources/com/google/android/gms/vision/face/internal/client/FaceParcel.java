package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class FaceParcel extends c4 {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new zkd((byte) 21);
    public final n9d[] E;
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
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new n9d[0], -1.0f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        bye.q(parcel, 4, 4);
        parcel.writeFloat(this.d);
        bye.q(parcel, 5, 4);
        parcel.writeFloat(this.e);
        bye.q(parcel, 6, 4);
        parcel.writeFloat(this.f);
        bye.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        bye.q(parcel, 8, 4);
        parcel.writeFloat(this.n);
        bye.o(parcel, 9, this.s, i);
        bye.q(parcel, 10, 4);
        parcel.writeFloat(this.w);
        bye.q(parcel, 11, 4);
        parcel.writeFloat(this.x);
        bye.q(parcel, 12, 4);
        parcel.writeFloat(this.y);
        bye.o(parcel, 13, this.E, i);
        bye.q(parcel, 14, 4);
        parcel.writeFloat(this.r);
        bye.q(parcel, 15, 4);
        parcel.writeFloat(this.F);
        bye.s(parcel, r);
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, n9d[] n9dVarArr, float f11) {
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
        this.E = n9dVarArr;
        this.F = f11;
    }
}
