package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g3 extends o6.a {
    public static final Parcelable.Creator<g3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static g3 b(m.e3 e3Var) {
        g3 g3Var = new g3();
        a3.l lVar = (a3.l) e3Var.b;
        g3Var.a = lVar.a;
        g3Var.b = lVar.b;
        g3Var.e = lVar.c;
        lVar.getClass();
        g3Var.c = 0;
        ((a3.l) e3Var.b).getClass();
        g3Var.d = 0L;
        return g3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j3 = this.d;
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(j3);
        int i14 = this.e;
        w7.e0.s(parcel, 6, 4);
        parcel.writeInt(i14);
        w7.e0.r(parcel, q6);
    }
}
