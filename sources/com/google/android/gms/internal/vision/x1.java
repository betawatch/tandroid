package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class x1 extends o6.a {
    public static final Parcelable.Creator<x1> CREATOR = new a1(0);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        boolean z10 = this.b;
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
