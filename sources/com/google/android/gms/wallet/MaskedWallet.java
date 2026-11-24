package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class MaskedWallet extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new c0f((byte) 23);
    public String a;
    public String b;
    public String[] c;
    public String d;
    public v4d e;
    public v4d f;
    public eg6[] h;
    public go7[] n;
    public UserAddress r;
    public UserAddress s;
    public ap5[] w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.m(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.k(parcel, 6, this.e, i);
        jte.k(parcel, 7, this.f, i);
        jte.o(parcel, 8, this.h, i);
        jte.o(parcel, 9, this.n, i);
        jte.k(parcel, 10, this.r, i);
        jte.k(parcel, 11, this.s, i);
        jte.o(parcel, 12, this.w, i);
        jte.s(parcel, r);
    }
}
