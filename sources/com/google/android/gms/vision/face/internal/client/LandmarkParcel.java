package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import r6.a;
import u8.o;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        bc.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
