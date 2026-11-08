package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class u0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ v0 a;

    public u0(v0 v0Var) {
        this.a = v0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.a.f()) {
            v0 v0Var = this.a;
            if (v0Var.f) {
                return;
            }
            if (i7 == 10 || i7 == 5) {
                v0Var.c("AUTH_CANCELED");
            } else {
                v0Var.a();
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
