package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f3 extends o6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(q5.d dVar) {
        f3 f3Var = new f3();
        a3.l lVar = (a3.l) dVar.b;
        f3Var.a = lVar.a;
        f3Var.b = lVar.b;
        f3Var.e = lVar.c;
        lVar.getClass();
        f3Var.c = 0;
        ((a3.l) dVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        int i11 = this.a;
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j10 = this.d;
        w7.h0.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i14 = this.e;
        w7.h0.s(parcel, 6, 4);
        parcel.writeInt(i14);
        w7.h0.r(parcel, q6);
    }
}
