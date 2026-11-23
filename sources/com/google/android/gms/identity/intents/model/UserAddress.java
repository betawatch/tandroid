package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.t0;
import r6.a;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new t0(26);
    public String E;
    public String F;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public String w;
    public String x;
    public boolean y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.l(parcel, 3, this.b);
        cc.l(parcel, 4, this.c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.e);
        cc.l(parcel, 7, this.f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.n);
        cc.l(parcel, 10, this.r);
        cc.l(parcel, 11, this.s);
        cc.l(parcel, 12, this.w);
        cc.l(parcel, 13, this.x);
        boolean z10 = this.y;
        cc.q(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.l(parcel, 15, this.E);
        cc.l(parcel, 16, this.F);
        cc.s(parcel, r10);
    }
}
