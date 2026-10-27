package com.google.android.gms.vision.face.internal.client;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import p6.a;
import q7.m;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class LandmarkParcel extends a {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new m(25);
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i10, float f7, float f10, int i11) {
        this.a = i10;
        this.b = f7;
        this.c = f10;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        df.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
