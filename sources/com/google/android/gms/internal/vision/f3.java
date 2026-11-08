package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class f3 extends r6.a {
    public static final Parcelable.Creator<f3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static f3 b(hy0 hy0Var) {
        f3 f3Var = new f3();
        b7.d dVar = (b7.d) hy0Var.b;
        f3Var.a = dVar.a;
        f3Var.b = dVar.b;
        f3Var.e = dVar.c;
        dVar.getClass();
        f3Var.c = 0;
        ((b7.d) hy0Var.b).getClass();
        f3Var.d = 0L;
        return f3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        long j3 = this.d;
        xb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        int i13 = this.e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i13);
        xb.s(parcel, r10);
    }
}
