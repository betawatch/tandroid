package com.google.android.gms.wallet.wobs;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p6.a;
import w8.s;
import x8.f;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new s(14);
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
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.n);
        int i11 = this.r;
        df.s(parcel, 10, 4);
        parcel.writeInt(i11);
        df.p(parcel, 11, this.s);
        df.k(parcel, 12, this.v, i10);
        df.p(parcel, 13, this.w);
        df.l(parcel, 14, this.x);
        df.l(parcel, 15, this.y);
        df.p(parcel, 16, this.E);
        boolean z10 = this.F;
        df.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.p(parcel, 18, this.G);
        df.p(parcel, 19, this.H);
        df.p(parcel, 20, this.I);
        df.r(parcel, q5);
    }
}
