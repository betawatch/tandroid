package com.google.android.gms.wallet;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import p6.a;
import w8.d;
import w8.f;
import w8.g;
import w8.q;
import w8.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new s(11);
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
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.m(parcel, 4, this.c);
        df.l(parcel, 5, this.d);
        df.k(parcel, 6, this.e, i10);
        df.k(parcel, 7, this.f, i10);
        df.o(parcel, 8, this.h, i10);
        df.o(parcel, 9, this.n, i10);
        df.k(parcel, 10, this.r, i10);
        df.k(parcel, 11, this.s, i10);
        df.o(parcel, 12, this.v, i10);
        df.r(parcel, q5);
    }
}
