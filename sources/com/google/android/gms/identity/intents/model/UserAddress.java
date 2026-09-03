package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.f5;
import r5.c0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new c0(10);
    public String B;
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
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.l(parcel, 4, this.c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.n);
        f5.l(parcel, 10, this.r);
        f5.l(parcel, 11, this.s);
        f5.l(parcel, 12, this.v);
        f5.l(parcel, 13, this.w);
        boolean z4 = this.x;
        f5.s(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.l(parcel, 15, this.y);
        f5.l(parcel, 16, this.B);
        f5.r(parcel, q10);
    }
}
