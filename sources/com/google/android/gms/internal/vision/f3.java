package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f3 extends o6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(m.g3 g3Var) {
        f3 f3Var = new f3();
        a3.l lVar = (a3.l) g3Var.b;
        f3Var.a = lVar.a;
        f3Var.b = lVar.b;
        f3Var.e = lVar.c;
        lVar.getClass();
        f3Var.c = 0;
        ((a3.l) g3Var.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j10 = this.d;
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i14 = this.e;
        w7.f0.s(parcel, 6, 4);
        parcel.writeInt(i14);
        w7.f0.r(parcel, q6);
    }
}
