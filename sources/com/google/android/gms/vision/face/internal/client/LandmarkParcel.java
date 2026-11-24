package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class LandmarkParcel extends b4 {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new rhe((byte) 28);
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
