package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class x1 extends r6.a {
    public static final Parcelable.Creator<x1> CREATOR = new a1(0);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        boolean z10 = this.b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.s(parcel, r10);
    }
}
