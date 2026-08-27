package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.r8;
import n6.w0;
import z5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new w0(15);
    public String A;
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
    public String v;
    public String w;
    public boolean x;
    public String y;

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
        r8.l(parcel, 10, this.r);
        r8.l(parcel, 11, this.s);
        r8.l(parcel, 12, this.v);
        r8.l(parcel, 13, this.w);
        boolean z10 = this.x;
        r8.s(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.l(parcel, 15, this.y);
        r8.l(parcel, 16, this.A);
        r8.r(parcel, q6);
    }
}
