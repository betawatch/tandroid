package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import q6.a;
import w8.b;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new b(1);
    public final w8.a[] E;
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

    public FaceParcel(int i3, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, w8.a[] aVarArr, float f20) {
        this.a = i3;
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.r(parcel, 3, 4);
        parcel.writeFloat(this.c);
        j8.a.r(parcel, 4, 4);
        parcel.writeFloat(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeFloat(this.e);
        j8.a.r(parcel, 6, 4);
        parcel.writeFloat(this.f);
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(this.h);
        j8.a.r(parcel, 8, 4);
        parcel.writeFloat(this.n);
        j8.a.p(parcel, 9, this.s, i3);
        j8.a.r(parcel, 10, 4);
        parcel.writeFloat(this.w);
        j8.a.r(parcel, 11, 4);
        parcel.writeFloat(this.x);
        j8.a.r(parcel, 12, 4);
        parcel.writeFloat(this.y);
        j8.a.p(parcel, 13, this.E, i3);
        j8.a.r(parcel, 14, 4);
        parcel.writeFloat(this.r);
        j8.a.r(parcel, 15, 4);
        parcel.writeFloat(this.F);
        j8.a.t(parcel, s6);
    }

    public FaceParcel(int i3, int i10, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i3, i10, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new w8.a[0], -1.0f);
    }
}
