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
import v8.r;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new r(13);
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
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.l(parcel, 3, this.b);
        g0.m(parcel, 4, this.c);
        g0.l(parcel, 5, this.d);
        g0.k(parcel, 6, this.e, i10);
        g0.k(parcel, 7, this.f, i10);
        g0.o(parcel, 8, this.h, i10);
        g0.o(parcel, 9, this.n, i10);
        g0.k(parcel, 10, this.r, i10);
        g0.k(parcel, 11, this.s, i10);
        g0.o(parcel, 12, this.v, i10);
        g0.r(parcel, q6);
    }
}
