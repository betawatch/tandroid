package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f3 extends c6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 e(androidx.biometric.e eVar) {
        f3 f3Var = new f3();
        e8.a aVar = (e8.a) eVar.b;
        f3Var.a = aVar.a;
        f3Var.b = aVar.b;
        f3Var.e = aVar.c;
        aVar.getClass();
        f3Var.c = 0;
        ((e8.a) eVar.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        g5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        long j10 = this.d;
        g5.s(parcel, 5, 8);
        parcel.writeLong(j10);
        int i14 = this.e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i14);
        g5.r(parcel, q10);
    }
}
