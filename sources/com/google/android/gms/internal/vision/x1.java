package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class x1 extends o6.a {
    public static final Parcelable.Creator<x1> CREATOR = new a1(0);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        boolean z10 = this.b;
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
