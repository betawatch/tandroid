package com.google.android.gms.vision.face.internal.client;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import g8.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class LandmarkParcel extends a {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new b(3);
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i10, float f9, float f10, int i11) {
        this.a = i10;
        this.b = f9;
        this.c = f10;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        o.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        o.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        o.r(parcel, q6);
    }
}
