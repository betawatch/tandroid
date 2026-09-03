package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import c6.a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.g5;
import l4.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new j(17);
    public final String a;
    public final GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        m.f(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.b;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions2 = this.b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1 * 31;
        String str = this.a;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.b;
        return hashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.k(parcel, 5, this.b, i10);
        g5.r(parcel, q10);
    }
}
