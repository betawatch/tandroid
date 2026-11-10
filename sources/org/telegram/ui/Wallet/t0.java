package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ u0 a;

    public t0(u0 u0Var) {
        this.a = u0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.a.f()) {
            u0 u0Var = this.a;
            if (u0Var.f) {
                return;
            }
            if (i7 == 10 || i7 == 5) {
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
