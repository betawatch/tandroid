package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import r6.a;
import y8.v;
import z8.f;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new v(7);
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
    public f w;
    public String y;
    public ArrayList s = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.l(parcel, 4, this.c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.e);
        bc.l(parcel, 7, this.f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.n);
        int i10 = this.r;
        bc.q(parcel, 10, 4);
        parcel.writeInt(i10);
        bc.p(parcel, 11, this.s);
        bc.k(parcel, 12, this.w, i7);
        bc.p(parcel, 13, this.x);
        bc.l(parcel, 14, this.y);
        bc.l(parcel, 15, this.E);
        bc.p(parcel, 16, this.F);
        boolean z10 = this.G;
        bc.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.p(parcel, 18, this.H);
        bc.p(parcel, 19, this.I);
        bc.p(parcel, 20, this.J);
        bc.s(parcel, r10);
    }
}
