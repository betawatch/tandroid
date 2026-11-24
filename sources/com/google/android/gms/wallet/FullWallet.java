package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class FullWallet extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new rhe((byte) 22);
    public String a;
    public String b;
    public l7d c;
    public String d;
    public v4d e;
    public v4d f;
    public String[] h;
    public UserAddress n;
    public UserAddress r;
    public ap5[] s;
    public vz7 w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.k(parcel, 4, this.c, i);
        jte.l(parcel, 5, this.d);
        jte.k(parcel, 6, this.e, i);
        jte.k(parcel, 7, this.f, i);
        jte.m(parcel, 8, this.h);
        jte.k(parcel, 9, this.n, i);
        jte.k(parcel, 10, this.r, i);
        jte.o(parcel, 11, this.s, i);
        jte.k(parcel, 12, this.w, i);
        jte.s(parcel, r);
    }
}
