package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import q6.a;
import w8.b;
import x8.d;
import x8.k;
import x8.q;
import x8.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class FullWallet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new b(15);
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.l(parcel, 4, this.c, i3);
        j8.a.m(parcel, 5, this.d);
        j8.a.l(parcel, 6, this.e, i3);
        j8.a.l(parcel, 7, this.f, i3);
        j8.a.n(parcel, 8, this.h);
        j8.a.l(parcel, 9, this.n, i3);
        j8.a.l(parcel, 10, this.r, i3);
        j8.a.p(parcel, 11, this.s, i3);
        j8.a.l(parcel, 12, this.w, i3);
        j8.a.t(parcel, s6);
    }
}
