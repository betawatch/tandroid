package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.g5;
import j8.d;
import j8.k;
import j8.q;
import j8.r;
import j8.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new t(4);
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
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.k(parcel, 4, this.c, i10);
        g5.l(parcel, 5, this.d);
        g5.k(parcel, 6, this.e, i10);
        g5.k(parcel, 7, this.f, i10);
        g5.m(parcel, 8, this.h);
        g5.k(parcel, 9, this.n, i10);
        g5.k(parcel, 10, this.r, i10);
        g5.o(parcel, 11, this.s, i10);
        g5.k(parcel, 12, this.v, i10);
        g5.r(parcel, q10);
    }
}
