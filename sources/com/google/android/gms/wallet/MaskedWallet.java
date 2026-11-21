package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r6.a;
import y8.d;
import y8.f;
import y8.g;
import y8.q;
import y8.v;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.m(parcel, 4, this.c);
        bc.l(parcel, 5, this.d);
        bc.k(parcel, 6, this.e, i7);
        bc.k(parcel, 7, this.f, i7);
        bc.o(parcel, 8, this.h, i7);
        bc.o(parcel, 9, this.n, i7);
        bc.k(parcel, 10, this.r, i7);
        bc.k(parcel, 11, this.s, i7);
        bc.o(parcel, 12, this.w, i7);
        bc.s(parcel, r10);
    }
}
