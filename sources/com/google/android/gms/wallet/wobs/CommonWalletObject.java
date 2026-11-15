package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import r6.a;
import y8.v;
import z8.f;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new v(7);
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.l(parcel, 4, this.c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.e);
        yb.l(parcel, 7, this.f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.n);
        int i10 = this.r;
        yb.q(parcel, 10, 4);
        parcel.writeInt(i10);
        yb.p(parcel, 11, this.s);
        yb.k(parcel, 12, this.w, i7);
        yb.p(parcel, 13, this.x);
        yb.l(parcel, 14, this.y);
        yb.l(parcel, 15, this.E);
        yb.p(parcel, 16, this.F);
        boolean z10 = this.G;
        yb.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.p(parcel, 18, this.H);
        yb.p(parcel, 19, this.I);
        yb.p(parcel, 20, this.J);
        yb.s(parcel, r10);
    }
}
