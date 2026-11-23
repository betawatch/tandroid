package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.t0;
import r6.a;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.l(parcel, 4, this.c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.e);
        bc.l(parcel, 7, this.f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.n);
        bc.l(parcel, 10, this.r);
        bc.l(parcel, 11, this.s);
        bc.l(parcel, 12, this.w);
        bc.l(parcel, 13, this.x);
        boolean z10 = this.y;
        bc.q(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 15, this.E);
        bc.l(parcel, 16, this.F);
        bc.s(parcel, r10);
    }
}
