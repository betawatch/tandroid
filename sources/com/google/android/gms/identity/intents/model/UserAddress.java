package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class UserAddress extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new j9d(11);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.l(parcel, 6, this.e);
        jte.l(parcel, 7, this.f);
        jte.l(parcel, 8, this.h);
        jte.l(parcel, 9, this.n);
        jte.l(parcel, 10, this.r);
        jte.l(parcel, 11, this.s);
        jte.l(parcel, 12, this.w);
        jte.l(parcel, 13, this.x);
        boolean z = this.y;
        jte.q(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.l(parcel, 15, this.E);
        jte.l(parcel, 16, this.F);
        jte.s(parcel, r);
    }
}
