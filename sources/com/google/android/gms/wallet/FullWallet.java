package com.google.android.gms.wallet;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.internal.cast.o;
import g8.b;
import h8.d;
import h8.k;
import h8.q;
import h8.r;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new b(20);
    public String a;
    public String b;
    public r c;
    public String d;
    public q e;
    public q f;
    public String[] h;
    public UserAddress n;
    public UserAddress r;
    public d[] s;
    public k v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.a);
        o.l(parcel, 3, this.b);
        o.k(parcel, 4, this.c, i10);
        o.l(parcel, 5, this.d);
        o.k(parcel, 6, this.e, i10);
        o.k(parcel, 7, this.f, i10);
        o.m(parcel, 8, this.h);
        o.k(parcel, 9, this.n, i10);
        o.k(parcel, 10, this.r, i10);
        o.o(parcel, 11, this.s, i10);
        o.k(parcel, 12, this.v, i10);
        o.r(parcel, q6);
    }
}
