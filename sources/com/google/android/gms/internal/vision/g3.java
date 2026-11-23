package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g3 extends r6.a {
    public static final Parcelable.Creator<g3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static g3 b(i61 i61Var) {
        g3 g3Var = new g3();
        b7.d dVar = (b7.d) i61Var.b;
        g3Var.a = dVar.a;
        g3Var.b = dVar.b;
        g3Var.e = dVar.c;
        dVar.getClass();
        g3Var.c = 0;
        ((b7.d) i61Var.b).getClass();
        g3Var.d = 0L;
        return g3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        long j3 = this.d;
        cc.q(parcel, 5, 8);
        parcel.writeLong(j3);
        int i13 = this.e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i13);
        cc.s(parcel, r10);
    }
}
