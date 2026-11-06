package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.k;
import y8.q;
import y8.r;
import y8.v;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.l(parcel, 3, this.b);
        wb.k(parcel, 4, this.c, i7);
        wb.l(parcel, 5, this.d);
        wb.k(parcel, 6, this.e, i7);
        wb.k(parcel, 7, this.f, i7);
        wb.m(parcel, 8, this.h);
        wb.k(parcel, 9, this.n, i7);
        wb.k(parcel, 10, this.r, i7);
        wb.o(parcel, 11, this.s, i7);
        wb.k(parcel, 12, this.w, i7);
        wb.s(parcel, r10);
    }
}
