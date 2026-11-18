package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.k;
import y8.q;
import y8.r;
import y8.v;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new v(0);
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
    public k w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.k(parcel, 4, this.c, i7);
        bc.l(parcel, 5, this.d);
        bc.k(parcel, 6, this.e, i7);
        bc.k(parcel, 7, this.f, i7);
        bc.m(parcel, 8, this.h);
        bc.k(parcel, 9, this.n, i7);
        bc.k(parcel, 10, this.r, i7);
        bc.o(parcel, 11, this.s, i7);
        bc.k(parcel, 12, this.w, i7);
        bc.s(parcel, r10);
    }
}
