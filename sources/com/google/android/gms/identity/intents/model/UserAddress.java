package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import o5.p;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new p(7);
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
        p8.l(parcel, 10, this.r);
        p8.l(parcel, 11, this.s);
        p8.l(parcel, 12, this.v);
        p8.l(parcel, 13, this.w);
        boolean z10 = this.x;
        p8.s(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.l(parcel, 15, this.y);
        p8.l(parcel, 16, this.A);
        p8.r(parcel, q10);
    }
}
