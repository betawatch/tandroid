package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class u0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ w0 a;

    public u0(w0 w0Var) {
        this.a = w0Var;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (this.a.f()) {
            w0 w0Var = this.a;
            if (w0Var.f) {
                return;
            }
            if (i10 == 10 || i10 == 5) {
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
