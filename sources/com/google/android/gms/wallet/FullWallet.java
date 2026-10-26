package com.google.android.gms.wallet;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import p6.a;
import w8.d;
import w8.k;
import w8.q;
import w8.r;
import w8.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new s(7);
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
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.k(parcel, 4, this.c, i10);
        df.l(parcel, 5, this.d);
        df.k(parcel, 6, this.e, i10);
        df.k(parcel, 7, this.f, i10);
        df.m(parcel, 8, this.h);
        df.k(parcel, 9, this.n, i10);
        df.k(parcel, 10, this.r, i10);
        df.o(parcel, 11, this.s, i10);
        df.k(parcel, 12, this.v, i10);
        df.r(parcel, q5);
    }
}
