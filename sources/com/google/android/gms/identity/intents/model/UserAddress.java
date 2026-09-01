package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.l(parcel, 4, this.c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.e);
        g5.l(parcel, 7, this.f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.n);
        g5.l(parcel, 10, this.r);
        g5.l(parcel, 11, this.s);
        g5.l(parcel, 12, this.v);
        g5.l(parcel, 13, this.w);
        boolean z4 = this.x;
        g5.s(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.l(parcel, 15, this.y);
        g5.l(parcel, 16, this.B);
        g5.r(parcel, q10);
    }
}
