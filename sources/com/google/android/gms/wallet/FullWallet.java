package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.k;
import y8.q;
import y8.r;
import y8.v;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.l(parcel, 3, this.b);
        cc.k(parcel, 4, this.c, i7);
        cc.l(parcel, 5, this.d);
        cc.k(parcel, 6, this.e, i7);
        cc.k(parcel, 7, this.f, i7);
        cc.m(parcel, 8, this.h);
        cc.k(parcel, 9, this.n, i7);
        cc.k(parcel, 10, this.r, i7);
        cc.o(parcel, 11, this.s, i7);
        cc.k(parcel, 12, this.w, i7);
        cc.s(parcel, r10);
    }
}
