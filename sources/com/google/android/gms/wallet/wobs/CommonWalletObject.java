package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import q6.a;
import w8.b;
import y8.f;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b(22);
    public String E;
    public boolean G;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public int r;
    public f w;
    public String y;
    public ArrayList s = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.e);
        j8.a.m(parcel, 7, this.f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.n);
        int i10 = this.r;
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(i10);
        j8.a.q(parcel, 11, this.s);
        j8.a.l(parcel, 12, this.w, i3);
        j8.a.q(parcel, 13, this.x);
        j8.a.m(parcel, 14, this.y);
        j8.a.m(parcel, 15, this.E);
        j8.a.q(parcel, 16, this.F);
        boolean z10 = this.G;
        j8.a.r(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.q(parcel, 18, this.H);
        j8.a.q(parcel, 19, this.I);
        j8.a.q(parcel, 20, this.J);
        j8.a.t(parcel, s6);
    }
}
