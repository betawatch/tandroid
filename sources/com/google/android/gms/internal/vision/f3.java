package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f3 extends q6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(p7.d dVar) {
        f3 f3Var = new f3();
        a7.d dVar2 = (a7.d) dVar.b;
        f3Var.a = dVar2.a;
        f3Var.b = dVar2.b;
        f3Var.e = dVar2.c;
        dVar2.getClass();
        f3Var.c = 0;
        ((a7.d) dVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i12);
        long j10 = this.d;
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(j10);
        int i13 = this.e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i13);
        j8.a.t(parcel, s6);
    }
}
