package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.c0;
import q6.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new c0(11);
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.e);
        j8.a.m(parcel, 7, this.f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.n);
        j8.a.m(parcel, 10, this.r);
        j8.a.m(parcel, 11, this.s);
        j8.a.m(parcel, 12, this.w);
        j8.a.m(parcel, 13, this.x);
        boolean z10 = this.y;
        j8.a.r(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.m(parcel, 15, this.E);
        j8.a.m(parcel, 16, this.F);
        j8.a.t(parcel, s6);
    }
}
