package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CommonWalletObject extends b4 {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new jid(5);
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
    public qpb w;
    public String y;
    public ArrayList s = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.l(parcel, 7, this.f);
        mve.l(parcel, 8, this.h);
        mve.l(parcel, 9, this.n);
        int i2 = this.r;
        mve.q(parcel, 10, 4);
        parcel.writeInt(i2);
        mve.p(parcel, 11, this.s);
        mve.k(parcel, 12, this.w, i);
        mve.p(parcel, 13, this.x);
        mve.l(parcel, 14, this.y);
        mve.l(parcel, 15, this.E);
        mve.p(parcel, 16, this.F);
        boolean z = this.G;
        mve.q(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.p(parcel, 18, this.H);
        mve.p(parcel, 19, this.I);
        mve.p(parcel, 20, this.J);
        mve.s(parcel, r);
    }
}
