package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.t0;
import r6.a;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.l(parcel, 4, this.c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.e);
        yb.l(parcel, 7, this.f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.n);
        yb.l(parcel, 10, this.r);
        yb.l(parcel, 11, this.s);
        yb.l(parcel, 12, this.w);
        yb.l(parcel, 13, this.x);
        boolean z10 = this.y;
        yb.q(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.l(parcel, 15, this.E);
        yb.l(parcel, 16, this.F);
        yb.s(parcel, r10);
    }
}
