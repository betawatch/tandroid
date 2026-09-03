package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.g5;
import j8.d;
import j8.f;
import j8.g;
import j8.q;
import j8.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new t(8);
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
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.m(parcel, 4, this.c);
        g5.l(parcel, 5, this.d);
        g5.k(parcel, 6, this.e, i10);
        g5.k(parcel, 7, this.f, i10);
        g5.o(parcel, 8, this.h, i10);
        g5.o(parcel, 9, this.n, i10);
        g5.k(parcel, 10, this.r, i10);
        g5.k(parcel, 11, this.s, i10);
        g5.o(parcel, 12, this.v, i10);
        g5.r(parcel, q10);
    }
}
