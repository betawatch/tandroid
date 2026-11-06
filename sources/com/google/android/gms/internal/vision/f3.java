package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        int i10 = this.a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        wb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        long j3 = this.d;
        wb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        int i13 = this.e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(i13);
        wb.s(parcel, r10);
    }
}
