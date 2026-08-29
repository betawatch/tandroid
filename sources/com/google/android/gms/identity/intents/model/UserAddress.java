package com.google.android.gms.identity.intents.model;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.o;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class UserAddress extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new w0(19);
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
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.a);
        o.l(parcel, 3, this.b);
        o.l(parcel, 4, this.c);
        o.l(parcel, 5, this.d);
        o.l(parcel, 6, this.e);
        o.l(parcel, 7, this.f);
        o.l(parcel, 8, this.h);
        o.l(parcel, 9, this.n);
        o.l(parcel, 10, this.r);
        o.l(parcel, 11, this.s);
        o.l(parcel, 12, this.v);
        o.l(parcel, 13, this.w);
        boolean z10 = this.x;
        o.s(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        o.l(parcel, 15, this.y);
        o.l(parcel, 16, this.A);
        o.r(parcel, q6);
    }
}
