package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class v0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.a.f()) {
            w0 w0Var = this.a;
            if (w0Var.f) {
                return;
            }
            if (i7 == 10 || i7 == 5) {
                w0Var.c("AUTH_CANCELED");
            } else {
                w0Var.a();
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
