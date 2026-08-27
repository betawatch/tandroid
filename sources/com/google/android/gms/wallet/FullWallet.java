package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import f4.e;
import g8.d;
import g8.k;
import g8.q;
import g8.r;
import h7.r8;
import z5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new e(21);
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
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.k(parcel, 4, this.c, i10);
        r8.l(parcel, 5, this.d);
        r8.k(parcel, 6, this.e, i10);
        r8.k(parcel, 7, this.f, i10);
        r8.m(parcel, 8, this.h);
        r8.k(parcel, 9, this.n, i10);
        r8.k(parcel, 10, this.r, i10);
        r8.o(parcel, 11, this.s, i10);
        r8.k(parcel, 12, this.v, i10);
        r8.r(parcel, q6);
    }
}
