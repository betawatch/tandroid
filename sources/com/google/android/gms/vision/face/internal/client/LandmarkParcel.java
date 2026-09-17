package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import o6.a;
import p7.j;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class LandmarkParcel extends a {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new j(27);
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
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        e0.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        e0.r(parcel, q6);
    }
}
