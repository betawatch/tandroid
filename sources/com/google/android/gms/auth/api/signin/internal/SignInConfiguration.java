package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class SignInConfiguration extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new b1d((byte) 23);
    public final String a;
    public final GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        fre.f(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.b;
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
        int i = 1 * 31;
        String str = this.a;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.b;
        return hashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.k(parcel, 5, this.b, i);
        jte.s(parcel, r);
    }
}
