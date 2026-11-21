package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g3 extends r6.a {
    public static final Parcelable.Creator<g3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static g3 b(md0 md0Var) {
        g3 g3Var = new g3();
        b7.d dVar = (b7.d) md0Var.b;
        g3Var.a = dVar.a;
        g3Var.b = dVar.b;
        g3Var.e = dVar.c;
        dVar.getClass();
        g3Var.c = 0;
        ((b7.d) md0Var.b).getClass();
        g3Var.d = 0L;
        return g3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        long j3 = this.d;
        bc.q(parcel, 5, 8);
        parcel.writeLong(j3);
        int i13 = this.e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i13);
        bc.s(parcel, r10);
    }
}
