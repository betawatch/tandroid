package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ u0 a;

    public t0(u0 u0Var) {
        this.a = u0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.a.f()) {
            u0 u0Var = this.a;
            if (u0Var.f) {
                return;
            }
            if (i10 == 10 || i10 == 5) {
                u0Var.c("AUTH_CANCELED");
            } else {
                u0Var.a();
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
