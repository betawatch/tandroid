package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o6.a;
import v8.r;
import w7.d0;
import w8.f;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new r(16);
    public boolean F;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public int r;
    public f v;
    public String x;
    public String y;
    public ArrayList s = new ArrayList();
    public ArrayList w = new ArrayList();
    public ArrayList E = new ArrayList();
    public ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList I = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.a);
        d0.l(parcel, 3, this.b);
        d0.l(parcel, 4, this.c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.e);
        d0.l(parcel, 7, this.f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.n);
        int i11 = this.r;
        d0.s(parcel, 10, 4);
        parcel.writeInt(i11);
        d0.p(parcel, 11, this.s);
        d0.k(parcel, 12, this.v, i10);
        d0.p(parcel, 13, this.w);
        d0.l(parcel, 14, this.x);
        d0.l(parcel, 15, this.y);
        d0.p(parcel, 16, this.E);
        boolean z10 = this.F;
        d0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.p(parcel, 18, this.G);
        d0.p(parcel, 19, this.H);
        d0.p(parcel, 20, this.I);
        d0.r(parcel, q6);
    }
}
