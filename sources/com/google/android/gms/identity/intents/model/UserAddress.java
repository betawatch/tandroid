package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class UserAddress extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new lbd(11);
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
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.l(parcel, 7, this.f);
        mve.l(parcel, 8, this.h);
        mve.l(parcel, 9, this.n);
        mve.l(parcel, 10, this.r);
        mve.l(parcel, 11, this.s);
        mve.l(parcel, 12, this.w);
        mve.l(parcel, 13, this.x);
        boolean z = this.y;
        mve.q(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.l(parcel, 15, this.E);
        mve.l(parcel, 16, this.F);
        mve.s(parcel, r);
    }
}
