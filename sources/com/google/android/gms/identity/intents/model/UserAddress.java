package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e6.i;
import o6.a;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new i(8);
    public String E;
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
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.l(parcel, 3, this.b);
        f0.l(parcel, 4, this.c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f);
        f0.l(parcel, 8, this.h);
        f0.l(parcel, 9, this.n);
        f0.l(parcel, 10, this.r);
        f0.l(parcel, 11, this.s);
        f0.l(parcel, 12, this.v);
        f0.l(parcel, 13, this.w);
        boolean z10 = this.x;
        f0.s(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 15, this.y);
        f0.l(parcel, 16, this.E);
        f0.r(parcel, q6);
    }
}
