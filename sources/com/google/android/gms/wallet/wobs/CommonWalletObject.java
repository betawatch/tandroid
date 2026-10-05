package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o6.a;
import v8.r;
import w7.g0;
import w8.f;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.l(parcel, 3, this.b);
        g0.l(parcel, 4, this.c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.e);
        g0.l(parcel, 7, this.f);
        g0.l(parcel, 8, this.h);
        g0.l(parcel, 9, this.n);
        int i11 = this.r;
        g0.s(parcel, 10, 4);
        parcel.writeInt(i11);
        g0.p(parcel, 11, this.s);
        g0.k(parcel, 12, this.v, i10);
        g0.p(parcel, 13, this.w);
        g0.l(parcel, 14, this.x);
        g0.l(parcel, 15, this.y);
        g0.p(parcel, 16, this.E);
        boolean z10 = this.F;
        g0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.p(parcel, 18, this.G);
        g0.p(parcel, 19, this.H);
        g0.p(parcel, 20, this.I);
        g0.r(parcel, q6);
    }
}
