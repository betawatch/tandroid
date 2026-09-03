package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import f8.o;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class LandmarkParcel extends a {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new o(11);
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i10, float f10, float f11, int i11) {
        this.a = i10;
        this.b = f10;
        this.c = f11;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        g5.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g5.r(parcel, q10);
    }
}
