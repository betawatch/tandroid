package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import h5.h;
import h7.r8;
import h8.f;
import java.util.ArrayList;
import z5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new h(6);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.l(parcel, 4, this.c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.e);
        r8.l(parcel, 7, this.f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.n);
        int i11 = this.r;
        r8.s(parcel, 10, 4);
        parcel.writeInt(i11);
        r8.p(parcel, 11, this.s);
        r8.k(parcel, 12, this.v, i10);
        r8.p(parcel, 13, this.w);
        r8.l(parcel, 14, this.x);
        r8.l(parcel, 15, this.y);
        r8.p(parcel, 16, this.A);
        boolean z10 = this.B;
        r8.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.p(parcel, 18, this.C);
        r8.p(parcel, 19, this.D);
        r8.p(parcel, 20, this.E);
        r8.r(parcel, q6);
    }
}
