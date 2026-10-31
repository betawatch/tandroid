package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import n6.l;
import o6.a;
import w7.h0;
import z5.d;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d(2);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        l.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        l.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 4, this.a);
        h0.k(parcel, 7, this.b, i10);
        h0.l(parcel, 8, this.c);
        h0.r(parcel, q6);
    }
}
