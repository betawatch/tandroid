package com.google.android.gms.internal.vision;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x1 extends p6.a {
    public static final Parcelable.Creator<x1> CREATOR = new a1(0);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        boolean z10 = this.b;
        df.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.r(parcel, q5);
    }
}
