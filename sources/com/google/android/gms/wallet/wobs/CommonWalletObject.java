package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import r6.a;
import y8.v;
import z8.f;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class CommonWalletObject extends a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new v(7);
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.l(parcel, 3, this.b);
        wb.l(parcel, 4, this.c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.e);
        wb.l(parcel, 7, this.f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.n);
        int i10 = this.r;
        wb.q(parcel, 10, 4);
        parcel.writeInt(i10);
        wb.p(parcel, 11, this.s);
        wb.k(parcel, 12, this.w, i7);
        wb.p(parcel, 13, this.x);
        wb.l(parcel, 14, this.y);
        wb.l(parcel, 15, this.D);
        wb.p(parcel, 16, this.E);
        boolean z9 = this.F;
        wb.q(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.p(parcel, 18, this.G);
        wb.p(parcel, 19, this.H);
        wb.p(parcel, 20, this.I);
        wb.s(parcel, r10);
    }
}
