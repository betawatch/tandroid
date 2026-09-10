package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o6.a;
import v8.r;
import w7.e0;
import w8.f;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.l(parcel, 3, this.b);
        e0.l(parcel, 4, this.c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.n);
        int i11 = this.r;
        e0.s(parcel, 10, 4);
        parcel.writeInt(i11);
        e0.p(parcel, 11, this.s);
        e0.k(parcel, 12, this.v, i10);
        e0.p(parcel, 13, this.w);
        e0.l(parcel, 14, this.x);
        e0.l(parcel, 15, this.y);
        e0.p(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.p(parcel, 18, this.G);
        e0.p(parcel, 19, this.H);
        e0.p(parcel, 20, this.I);
        e0.r(parcel, q6);
    }
}
