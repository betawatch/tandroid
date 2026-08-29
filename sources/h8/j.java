package h8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new g8.b(10);
    public boolean a;
    public boolean b;
    public c c;
    public boolean d;
    public m e;
    public ArrayList f;
    public l h;
    public n n;
    public boolean r;
    public String s;
    public Bundle v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        boolean z10 = this.a;
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.c, i10);
        boolean z12 = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.e, i10);
        com.google.android.gms.internal.cast.o.h(parcel, 6, this.f);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.h, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 8, this.n, i10);
        boolean z13 = this.r;
        com.google.android.gms.internal.cast.o.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.s);
        com.google.android.gms.internal.cast.o.b(parcel, 11, this.v);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
