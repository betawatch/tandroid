package h8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new g8.b(23);
    public String A;
    public String B;
    public ArrayList C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public i8.c H;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public int v;
    public ArrayList w;
    public i8.f x;
    public ArrayList y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.e);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.f);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.n);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.r);
        com.google.android.gms.internal.cast.o.l(parcel, 11, this.s);
        int i11 = this.v;
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.p(parcel, 13, this.w);
        com.google.android.gms.internal.cast.o.k(parcel, 14, this.x, i10);
        com.google.android.gms.internal.cast.o.p(parcel, 15, this.y);
        com.google.android.gms.internal.cast.o.l(parcel, 16, this.A);
        com.google.android.gms.internal.cast.o.l(parcel, 17, this.B);
        com.google.android.gms.internal.cast.o.p(parcel, 18, this.C);
        boolean z10 = this.D;
        com.google.android.gms.internal.cast.o.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.cast.o.p(parcel, 20, this.E);
        com.google.android.gms.internal.cast.o.p(parcel, 21, this.F);
        com.google.android.gms.internal.cast.o.p(parcel, 22, this.G);
        com.google.android.gms.internal.cast.o.k(parcel, 23, this.H, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
