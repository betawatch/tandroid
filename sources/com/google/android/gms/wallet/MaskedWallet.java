package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class MaskedWallet extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new t4f((byte) 23);
    public String a;
    public String b;
    public String[] c;
    public String d;
    public o9d e;
    public o9d f;
    public ii6[] h;
    public gr7[] n;
    public UserAddress r;
    public UserAddress s;
    public dr5[] w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.m(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.k(parcel, 6, this.e, i);
        bye.k(parcel, 7, this.f, i);
        bye.o(parcel, 8, this.h, i);
        bye.o(parcel, 9, this.n, i);
        bye.k(parcel, 10, this.r, i);
        bye.k(parcel, 11, this.s, i);
        bye.o(parcel, 12, this.w, i);
        bye.s(parcel, r);
    }
}
