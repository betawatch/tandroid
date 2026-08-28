package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import f8.d;
import f8.f;
import f8.g;
import f8.q;
import f8.r;
import g7.p8;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class MaskedWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new r(12);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.m(parcel, 4, this.c);
        p8.l(parcel, 5, this.d);
        p8.k(parcel, 6, this.e, i9);
        p8.k(parcel, 7, this.f, i9);
        p8.o(parcel, 8, this.h, i9);
        p8.o(parcel, 9, this.n, i9);
        p8.k(parcel, 10, this.r, i9);
        p8.k(parcel, 11, this.s, i9);
        p8.o(parcel, 12, this.v, i9);
        p8.r(parcel, q10);
    }
}
