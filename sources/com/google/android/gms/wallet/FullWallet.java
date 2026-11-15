package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.k;
import y8.q;
import y8.r;
import y8.v;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.k(parcel, 4, this.c, i7);
        yb.l(parcel, 5, this.d);
        yb.k(parcel, 6, this.e, i7);
        yb.k(parcel, 7, this.f, i7);
        yb.m(parcel, 8, this.h);
        yb.k(parcel, 9, this.n, i7);
        yb.k(parcel, 10, this.r, i7);
        yb.o(parcel, 11, this.s, i7);
        yb.k(parcel, 12, this.w, i7);
        yb.s(parcel, r10);
    }
}
