package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class CommonWalletObject extends b4 {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new igd(5);
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
    public pnb w;
    public String y;
    public ArrayList s = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.l(parcel, 6, this.e);
        jte.l(parcel, 7, this.f);
        jte.l(parcel, 8, this.h);
        jte.l(parcel, 9, this.n);
        int i2 = this.r;
        jte.q(parcel, 10, 4);
        parcel.writeInt(i2);
        jte.p(parcel, 11, this.s);
        jte.k(parcel, 12, this.w, i);
        jte.p(parcel, 13, this.x);
        jte.l(parcel, 14, this.y);
        jte.l(parcel, 15, this.E);
        jte.p(parcel, 16, this.F);
        boolean z = this.G;
        jte.q(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.p(parcel, 18, this.H);
        jte.p(parcel, 19, this.I);
        jte.p(parcel, 20, this.J);
        jte.s(parcel, r);
    }
}
