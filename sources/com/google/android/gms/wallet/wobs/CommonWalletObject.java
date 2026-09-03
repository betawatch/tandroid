package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import j7.f5;
import j8.t;
import java.util.ArrayList;
import k8.f;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.l(parcel, 4, this.c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.n);
        int i11 = this.r;
        f5.s(parcel, 10, 4);
        parcel.writeInt(i11);
        f5.p(parcel, 11, this.s);
        f5.k(parcel, 12, this.v, i10);
        f5.p(parcel, 13, this.w);
        f5.l(parcel, 14, this.x);
        f5.l(parcel, 15, this.y);
        f5.p(parcel, 16, this.B);
        boolean z4 = this.C;
        f5.s(parcel, 17, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.p(parcel, 18, this.D);
        f5.p(parcel, 19, this.E);
        f5.p(parcel, 20, this.F);
        f5.r(parcel, q10);
    }
}
