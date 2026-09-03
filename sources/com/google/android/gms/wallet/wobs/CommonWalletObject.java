package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import j7.g5;
import j8.t;
import java.util.ArrayList;
import k8.f;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new t(16);
    public boolean C;
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
    public ArrayList B = new ArrayList();
    public ArrayList D = new ArrayList();
    public ArrayList E = new ArrayList();
    public ArrayList F = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.l(parcel, 4, this.c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.e);
        g5.l(parcel, 7, this.f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.n);
        int i11 = this.r;
        g5.s(parcel, 10, 4);
        parcel.writeInt(i11);
        g5.p(parcel, 11, this.s);
        g5.k(parcel, 12, this.v, i10);
        g5.p(parcel, 13, this.w);
        g5.l(parcel, 14, this.x);
        g5.l(parcel, 15, this.y);
        g5.p(parcel, 16, this.B);
        boolean z4 = this.C;
        g5.s(parcel, 17, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.p(parcel, 18, this.D);
        g5.p(parcel, 19, this.E);
        g5.p(parcel, 20, this.F);
        g5.r(parcel, q10);
    }
}
