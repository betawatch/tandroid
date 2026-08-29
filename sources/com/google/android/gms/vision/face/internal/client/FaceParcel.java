package com.google.android.gms.vision.face.internal.client;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import g8.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new b(1);
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
    public final g8.a[] y;

    public FaceParcel(int i10, int i11, float f9, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18, g8.a[] aVarArr, float f19) {
        this.a = i10;
        this.b = i11;
        this.c = f9;
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
        this.A = f19;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        o.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        o.s(parcel, 4, 4);
        parcel.writeFloat(this.d);
        o.s(parcel, 5, 4);
        parcel.writeFloat(this.e);
        o.s(parcel, 6, 4);
        parcel.writeFloat(this.f);
        o.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        o.s(parcel, 8, 4);
        parcel.writeFloat(this.n);
        o.o(parcel, 9, this.s, i10);
        o.s(parcel, 10, 4);
        parcel.writeFloat(this.v);
        o.s(parcel, 11, 4);
        parcel.writeFloat(this.w);
        o.s(parcel, 12, 4);
        parcel.writeFloat(this.x);
        o.o(parcel, 13, this.y, i10);
        o.s(parcel, 14, 4);
        parcel.writeFloat(this.r);
        o.s(parcel, 15, 4);
        parcel.writeFloat(this.A);
        o.r(parcel, q6);
    }

    public FaceParcel(int i10, int i11, float f9, float f10, float f11, float f12, float f13, float f14, LandmarkParcel[] landmarkParcelArr, float f15, float f16, float f17) {
        this(i10, i11, f9, f10, f11, f12, f13, f14, 0.0f, landmarkParcelArr, f15, f16, f17, new g8.a[0], -1.0f);
    }
}
