package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w.a(27);
    public final String a;
    public final GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        m.e(str);
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
        int i7 = 1 * 31;
        String str = this.a;
        int hashCode = (i7 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.b;
        return hashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.k(parcel, 5, this.b, i7);
        xb.s(parcel, r10);
    }
}
