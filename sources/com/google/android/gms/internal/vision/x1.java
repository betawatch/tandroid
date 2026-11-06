package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class x1 extends r6.a {
    public static final Parcelable.Creator<x1> CREATOR = new a1(0);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        boolean z9 = this.b;
        wb.q(parcel, 3, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.s(parcel, r10);
    }
}
