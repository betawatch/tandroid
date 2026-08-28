package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
import g8.f;
import java.util.ArrayList;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new r(20);
    public boolean B;
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
    public ArrayList A = new ArrayList();
    public ArrayList C = new ArrayList();
    public ArrayList D = new ArrayList();
    public ArrayList E = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.e);
        p8.l(parcel, 7, this.f);
        p8.l(parcel, 8, this.h);
        p8.l(parcel, 9, this.n);
        int i10 = this.r;
        p8.s(parcel, 10, 4);
        parcel.writeInt(i10);
        p8.p(parcel, 11, this.s);
        p8.k(parcel, 12, this.v, i9);
        p8.p(parcel, 13, this.w);
        p8.l(parcel, 14, this.x);
        p8.l(parcel, 15, this.y);
        p8.p(parcel, 16, this.A);
        boolean z10 = this.B;
        p8.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.p(parcel, 18, this.C);
        p8.p(parcel, 19, this.D);
        p8.p(parcel, 20, this.E);
        p8.r(parcel, q10);
    }
}
