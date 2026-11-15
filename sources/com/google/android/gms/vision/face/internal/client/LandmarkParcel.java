package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import r6.a;
import u8.o;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class LandmarkParcel extends a {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new o(18);
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i7, float f10, float f11, int i10) {
        this.a = i7;
        this.b = f10;
        this.c = f11;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        yb.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.s(parcel, r10);
    }
}
