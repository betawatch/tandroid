package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o6.a;
import v8.s;
import w7.h0;
import w8.f;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new s(13);
    public String D;
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
    public f w;
    public String y;
    public ArrayList s = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList E = new ArrayList();
    public ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList I = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.n);
        int i11 = this.r;
        h0.s(parcel, 10, 4);
        parcel.writeInt(i11);
        h0.p(parcel, 11, this.s);
        h0.k(parcel, 12, this.w, i10);
        h0.p(parcel, 13, this.x);
        h0.l(parcel, 14, this.y);
        h0.l(parcel, 15, this.D);
        h0.p(parcel, 16, this.E);
        boolean z10 = this.F;
        h0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.p(parcel, 18, this.G);
        h0.p(parcel, 19, this.H);
        h0.p(parcel, 20, this.I);
        h0.r(parcel, q6);
    }
}
