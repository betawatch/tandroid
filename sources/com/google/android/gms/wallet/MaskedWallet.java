package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import o6.a;
import v8.d;
import v8.f;
import v8.g;
import v8.q;
import v8.r;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new r(13);
    public String a;
    public String b;
    public String[] c;
    public String d;
    public q e;
    public q f;
    public f[] h;
    public g[] n;
    public UserAddress r;
    public UserAddress s;
    public d[] v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.l(parcel, 3, this.b);
        e0.m(parcel, 4, this.c);
        e0.l(parcel, 5, this.d);
        e0.k(parcel, 6, this.e, i10);
        e0.k(parcel, 7, this.f, i10);
        e0.o(parcel, 8, this.h, i10);
        e0.o(parcel, 9, this.n, i10);
        e0.k(parcel, 10, this.r, i10);
        e0.k(parcel, 11, this.s, i10);
        e0.o(parcel, 12, this.v, i10);
        e0.r(parcel, q6);
    }
}
