package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x1 extends q6.a {
    public static final Parcelable.Creator<x1> CREATOR = new a1(0);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        boolean z10 = this.b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
