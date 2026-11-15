package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new w.a(25);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        m.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        m.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 4, this.a);
        yb.k(parcel, 7, this.b, i7);
        yb.l(parcel, 8, this.c);
        yb.s(parcel, r10);
    }
}
