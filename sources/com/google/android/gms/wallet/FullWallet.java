package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.k;
import y8.q;
import y8.r;
import y8.v;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.k(parcel, 4, this.c, i7);
        xb.l(parcel, 5, this.d);
        xb.k(parcel, 6, this.e, i7);
        xb.k(parcel, 7, this.f, i7);
        xb.m(parcel, 8, this.h);
        xb.k(parcel, 9, this.n, i7);
        xb.k(parcel, 10, this.r, i7);
        xb.o(parcel, 11, this.s, i7);
        xb.k(parcel, 12, this.w, i7);
        xb.s(parcel, r10);
    }
}
