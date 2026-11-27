package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class UserAddress extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new ced(11);
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
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.l(parcel, 6, this.e);
        bye.l(parcel, 7, this.f);
        bye.l(parcel, 8, this.h);
        bye.l(parcel, 9, this.n);
        bye.l(parcel, 10, this.r);
        bye.l(parcel, 11, this.s);
        bye.l(parcel, 12, this.w);
        bye.l(parcel, 13, this.x);
        boolean z = this.y;
        bye.q(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.l(parcel, 15, this.E);
        bye.l(parcel, 16, this.F);
        bye.s(parcel, r);
    }
}
