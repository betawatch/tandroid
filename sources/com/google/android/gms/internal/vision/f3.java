package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f3 extends y5.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(a5.m mVar) {
        f3 f3Var = new f3();
        a8.b bVar = (a8.b) mVar.b;
        f3Var.a = bVar.a;
        f3Var.b = bVar.b;
        f3Var.e = bVar.c;
        bVar.getClass();
        f3Var.c = 0;
        ((a8.b) mVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i12);
        long j10 = this.d;
        p8.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i13 = this.e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i13);
        p8.r(parcel, q10);
    }
}
