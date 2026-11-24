package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class FullWallet extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new sje((byte) 22);
    public String a;
    public String b;
    public n9d c;
    public String d;
    public x6d e;
    public x6d f;
    public String[] h;
    public UserAddress n;
    public UserAddress r;
    public ar5[] s;
    public y18 w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.k(parcel, 4, this.c, i);
        mve.l(parcel, 5, this.d);
        mve.k(parcel, 6, this.e, i);
        mve.k(parcel, 7, this.f, i);
        mve.m(parcel, 8, this.h);
        mve.k(parcel, 9, this.n, i);
        mve.k(parcel, 10, this.r, i);
        mve.o(parcel, 11, this.s, i);
        mve.k(parcel, 12, this.w, i);
        mve.s(parcel, r);
    }
}
