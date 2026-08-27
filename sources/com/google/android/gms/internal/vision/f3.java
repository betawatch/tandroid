package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f3 extends z5.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(a5.n nVar) {
        f3 f3Var = new f3();
        b8.b bVar = (b8.b) nVar.b;
        f3Var.a = bVar.a;
        f3Var.b = bVar.b;
        f3Var.e = bVar.c;
        bVar.getClass();
        f3Var.c = 0;
        ((b8.b) nVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        int i11 = this.a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j10 = this.d;
        r8.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i14 = this.e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i14);
        r8.r(parcel, q6);
    }
}
