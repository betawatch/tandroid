package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f3 extends a6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(androidx.biometric.e eVar) {
        f3 f3Var = new f3();
        c8.a aVar = (c8.a) eVar.b;
        f3Var.a = aVar.a;
        f3Var.b = aVar.b;
        f3Var.e = aVar.c;
        aVar.getClass();
        f3Var.c = 0;
        ((c8.a) eVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j10 = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i14 = this.e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(i14);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
