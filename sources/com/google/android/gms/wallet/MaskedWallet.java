package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.f;
import y8.g;
import y8.q;
import y8.v;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new v(4);
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
    public d[] w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.m(parcel, 4, this.c);
        yb.l(parcel, 5, this.d);
        yb.k(parcel, 6, this.e, i7);
        yb.k(parcel, 7, this.f, i7);
        yb.o(parcel, 8, this.h, i7);
        yb.o(parcel, 9, this.n, i7);
        yb.k(parcel, 10, this.r, i7);
        yb.k(parcel, 11, this.s, i7);
        yb.o(parcel, 12, this.w, i7);
        yb.s(parcel, r10);
    }
}
