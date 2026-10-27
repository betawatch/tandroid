package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ v0 a;

    public t0(v0 v0Var) {
        this.a = v0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.a.f()) {
            v0 v0Var = this.a;
            if (v0Var.f) {
                return;
            }
            if (i10 == 10 || i10 == 5) {
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
