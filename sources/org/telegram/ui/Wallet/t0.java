package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
