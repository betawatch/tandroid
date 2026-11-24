package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class SignInAccount extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d3d((byte) 16);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        ite.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        ite.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 4, this.a);
        mve.k(parcel, 7, this.b, i);
        mve.l(parcel, 8, this.c);
        mve.s(parcel, r);
    }
}
