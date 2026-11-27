package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class SignInAccount extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new s5d((byte) 16);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        xve.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        xve.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 4, this.a);
        bye.k(parcel, 7, this.b, i);
        bye.l(parcel, 8, this.c);
        bye.s(parcel, r);
    }
}
