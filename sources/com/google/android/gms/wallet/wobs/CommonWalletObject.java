package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class CommonWalletObject extends c4 {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zkd(5);
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
    public prb w;
    public String y;
    public ArrayList s = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.l(parcel, 6, this.e);
        bye.l(parcel, 7, this.f);
        bye.l(parcel, 8, this.h);
        bye.l(parcel, 9, this.n);
        int i2 = this.r;
        bye.q(parcel, 10, 4);
        parcel.writeInt(i2);
        bye.p(parcel, 11, this.s);
        bye.k(parcel, 12, this.w, i);
        bye.p(parcel, 13, this.x);
        bye.l(parcel, 14, this.y);
        bye.l(parcel, 15, this.E);
        bye.p(parcel, 16, this.F);
        boolean z = this.G;
        bye.q(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.p(parcel, 18, this.H);
        bye.p(parcel, 19, this.I);
        bye.p(parcel, 20, this.J);
        bye.s(parcel, r);
    }
}
