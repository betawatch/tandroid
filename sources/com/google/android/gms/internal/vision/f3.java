package com.google.android.gms.internal.vision;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f3 extends p6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(k6.c cVar) {
        f3 f3Var = new f3();
        a3.l lVar = (a3.l) cVar.b;
        f3Var.a = lVar.a;
        f3Var.b = lVar.b;
        f3Var.e = lVar.c;
        lVar.getClass();
        f3Var.c = 0;
        ((a3.l) cVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        df.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j10 = this.d;
        df.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i14 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeInt(i14);
        df.r(parcel, q5);
    }
}
