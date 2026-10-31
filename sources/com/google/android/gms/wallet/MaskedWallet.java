package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import o6.a;
import v8.d;
import v8.f;
import v8.g;
import v8.q;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new s(10);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.m(parcel, 4, this.c);
        h0.l(parcel, 5, this.d);
        h0.k(parcel, 6, this.e, i10);
        h0.k(parcel, 7, this.f, i10);
        h0.o(parcel, 8, this.h, i10);
        h0.o(parcel, 9, this.n, i10);
        h0.k(parcel, 10, this.r, i10);
        h0.k(parcel, 11, this.s, i10);
        h0.o(parcel, 12, this.w, i10);
        h0.r(parcel, q6);
    }
}
