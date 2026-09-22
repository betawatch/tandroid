package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o6.a;
import v8.r;
import w7.f0;
import w8.f;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.l(parcel, 3, this.b);
        f0.l(parcel, 4, this.c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.n);
        int i11 = this.r;
        f0.s(parcel, 10, 4);
        parcel.writeInt(i11);
        f0.p(parcel, 11, this.s);
        f0.k(parcel, 12, this.v, i10);
        f0.p(parcel, 13, this.w);
        f0.l(parcel, 14, this.x);
        f0.l(parcel, 15, this.y);
        f0.p(parcel, 16, this.E);
        boolean z10 = this.F;
        f0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.p(parcel, 18, this.G);
        f0.p(parcel, 19, this.H);
        f0.p(parcel, 20, this.I);
        f0.r(parcel, q6);
    }
}
