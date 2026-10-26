package com.google.android.gms.identity.intents.model;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.i;
import p6.a;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.n);
        df.l(parcel, 10, this.r);
        df.l(parcel, 11, this.s);
        df.l(parcel, 12, this.v);
        df.l(parcel, 13, this.w);
        boolean z10 = this.x;
        df.s(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.l(parcel, 15, this.y);
        df.l(parcel, 16, this.E);
        df.r(parcel, q5);
    }
}
