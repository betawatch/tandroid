package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class FullWallet extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new ime((byte) 22);
    public String a;
    public String b;
    public ecd c;
    public String d;
    public o9d e;
    public o9d f;
    public String[] h;
    public UserAddress n;
    public UserAddress r;
    public dr5[] s;
    public b38 w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.k(parcel, 4, this.c, i);
        bye.l(parcel, 5, this.d);
        bye.k(parcel, 6, this.e, i);
        bye.k(parcel, 7, this.f, i);
        bye.m(parcel, 8, this.h);
        bye.k(parcel, 9, this.n, i);
        bye.k(parcel, 10, this.r, i);
        bye.o(parcel, 11, this.s, i);
        bye.k(parcel, 12, this.w, i);
        bye.s(parcel, r);
    }
}
