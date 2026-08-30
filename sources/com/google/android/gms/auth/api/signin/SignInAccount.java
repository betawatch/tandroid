package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.f5;
import n5.d;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d(2);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        m.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        m.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 4, this.a);
        f5.k(parcel, 7, this.b, i10);
        f5.l(parcel, 8, this.c);
        f5.r(parcel, q10);
    }
}
