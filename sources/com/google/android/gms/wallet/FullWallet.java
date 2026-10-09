package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import o6.a;
import v8.d;
import v8.k;
import v8.q;
import v8.r;
import v8.s;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new r(9);
    public String a;
    public String b;
    public s c;
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
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.a);
        d0.l(parcel, 3, this.b);
        d0.k(parcel, 4, this.c, i10);
        d0.l(parcel, 5, this.d);
        d0.k(parcel, 6, this.e, i10);
        d0.k(parcel, 7, this.f, i10);
        d0.m(parcel, 8, this.h);
        d0.k(parcel, 9, this.n, i10);
        d0.k(parcel, 10, this.r, i10);
        d0.o(parcel, 11, this.s, i10);
        d0.k(parcel, 12, this.v, i10);
        d0.r(parcel, q6);
    }
}
