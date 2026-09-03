package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f3 extends c6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 e(af.d dVar) {
        f3 f3Var = new f3();
        e8.a aVar = (e8.a) dVar.b;
        f3Var.a = aVar.a;
        f3Var.b = aVar.b;
        f3Var.e = aVar.c;
        aVar.getClass();
        f3Var.c = 0;
        ((e8.a) dVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j10 = this.d;
        f5.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i14 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i14);
        f5.r(parcel, q10);
    }
}
