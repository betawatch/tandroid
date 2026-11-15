package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g3 extends r6.a {
    public static final Parcelable.Creator<g3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static g3 b(ld0 ld0Var) {
        g3 g3Var = new g3();
        b7.d dVar = (b7.d) ld0Var.b;
        g3Var.a = dVar.a;
        g3Var.b = dVar.b;
        g3Var.e = dVar.c;
        dVar.getClass();
        g3Var.c = 0;
        ((b7.d) ld0Var.b).getClass();
        g3Var.d = 0L;
        return g3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        long j3 = this.d;
        yb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        int i13 = this.e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i13);
        yb.s(parcel, r10);
    }
}
