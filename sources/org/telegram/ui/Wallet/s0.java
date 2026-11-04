package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ t0 a;

    public s0(t0 t0Var) {
        this.a = t0Var;
    }

    public final void onAuthenticationError(int i3, CharSequence charSequence) {
        if (this.a.f()) {
            t0 t0Var = this.a;
            if (t0Var.f) {
                return;
            }
            if (i3 == 10 || i3 == 5) {
                t0Var.c("AUTH_CANCELED");
            } else {
                t0Var.a();
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
