package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c.c;
import g7.p8;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class LandmarkParcel extends a {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new c(20);
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i9, float f10, float f11, int i10) {
        this.a = i9;
        this.b = f10;
        this.c = f11;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }
}
