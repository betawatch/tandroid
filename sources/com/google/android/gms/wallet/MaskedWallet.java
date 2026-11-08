package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.f;
import y8.g;
import y8.q;
import y8.v;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.m(parcel, 4, this.c);
        xb.l(parcel, 5, this.d);
        xb.k(parcel, 6, this.e, i7);
        xb.k(parcel, 7, this.f, i7);
        xb.o(parcel, 8, this.h, i7);
        xb.o(parcel, 9, this.n, i7);
        xb.k(parcel, 10, this.r, i7);
        xb.k(parcel, 11, this.s, i7);
        xb.o(parcel, 12, this.w, i7);
        xb.s(parcel, r10);
    }
}
