package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class SignInAccount extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new b1d((byte) 16);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        fre.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        fre.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 4, this.a);
        jte.k(parcel, 7, this.b, i);
        jte.l(parcel, 8, this.c);
        jte.s(parcel, r);
    }
}
