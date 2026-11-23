package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import r6.a;
import y8.v;
import z8.f;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.l(parcel, 3, this.b);
        cc.l(parcel, 4, this.c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.e);
        cc.l(parcel, 7, this.f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.n);
        int i10 = this.r;
        cc.q(parcel, 10, 4);
        parcel.writeInt(i10);
        cc.p(parcel, 11, this.s);
        cc.k(parcel, 12, this.w, i7);
        cc.p(parcel, 13, this.x);
        cc.l(parcel, 14, this.y);
        cc.l(parcel, 15, this.E);
        cc.p(parcel, 16, this.F);
        boolean z10 = this.G;
        cc.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.p(parcel, 18, this.H);
        cc.p(parcel, 19, this.I);
        cc.p(parcel, 20, this.J);
        cc.s(parcel, r10);
    }
}
