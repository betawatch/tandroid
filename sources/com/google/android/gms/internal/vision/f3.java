package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
