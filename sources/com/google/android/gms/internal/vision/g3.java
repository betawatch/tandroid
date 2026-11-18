package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import org.telegram.ui.nd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class g3 extends r6.a {
    public static final Parcelable.Creator<g3> CREATOR = new a1(1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static g3 b(nd0 nd0Var) {
        g3 g3Var = new g3();
        b7.d dVar = (b7.d) nd0Var.b;
        g3Var.a = dVar.a;
        g3Var.b = dVar.b;
        g3Var.e = dVar.c;
        dVar.getClass();
        g3Var.c = 0;
        ((b7.d) nd0Var.b).getClass();
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
